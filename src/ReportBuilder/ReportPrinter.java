package ReportBuilder;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Objects;

import static java.lang.Math.ceil;

public class ReportPrinter {

    public static void PrintTimePeriodsReport(List<ReportEntry> reportEntries, File outputFile) {
        try (PrintStream stream = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)), true)) {
            int dayCounter = 1;
            stream.append("День " + dayCounter + ":\n");
            for (int i = 0; i < reportEntries.size(); i++) {
                if (Objects.equals(reportEntries.get(i).getActivity(), "Конец")) {
                    dayCounter++;
                    if (i != reportEntries.size() - 1) {
                        stream.append("\n")
                                .append("День " + dayCounter + ":\n");
                    }
                } else {
                    stream.append(reportEntries.get(i).getTimeStamp())
                            .append("-").append(reportEntries.get(i + 1).getTimeStamp())
                            .append(" ").append(reportEntries.get(i).getActivity())
                            .append("\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void PrintActivitiesPercentageReport(List<ReportEntry> reportEntries, File outputFile) {
        try (PrintStream stream = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)), true)) {
            double courseDayDuration = ReportEntry.timeStampInMinutes(reportEntries.get(reportEntries.size() - 1))
                    - ReportEntry.timeStampInMinutes(reportEntries.get(0));
            int lecturesDuration = 0;
            int tasksDuration = 0;
            int breaksDuration = 0;
            int dayCounter = 1;
            StringBuilder lecturesDetails = new StringBuilder();

            for (int i = 0; i < reportEntries.size(); i++) {
                if (Objects.equals(reportEntries.get(i).getActivity(), "Упражнения")
                        | Objects.equals(reportEntries.get(i).getActivity(), "Решения")) {
                    tasksDuration += ReportEntry.timeStampInMinutes(reportEntries.get(++i))
                            - ReportEntry.timeStampInMinutes(reportEntries.get(--i));
                } else if (Objects.equals(reportEntries.get(i).getActivity(), "Перерыв")
                        | Objects.equals(reportEntries.get(i).getActivity(), "Обеденный перерыв")) {
                    breaksDuration += ReportEntry.timeStampInMinutes(reportEntries.get(++i))
                            - ReportEntry.timeStampInMinutes(reportEntries.get(--i));
                } else if (Objects.equals(reportEntries.get(i).getActivity(), "Конец")) {
                    stream.append("День " + dayCounter + "\n")
                            .append("Лекции: " + lecturesDuration + " минут "
                                    + ceil(lecturesDuration / courseDayDuration * 100) + "%\n")
                            .append("Решения: " + tasksDuration + " минут "
                                    + ceil(tasksDuration / courseDayDuration * 100) + "%\n")
                            .append("Перерыв: " + breaksDuration + " минут "
                                    + ceil(breaksDuration / courseDayDuration * 100) + "%\n" + "...\n")
                            .append("Лекции:\n" + lecturesDetails + "\n");
                    lecturesDuration = 0;
                    tasksDuration = 0;
                    breaksDuration = 0;
                    dayCounter++;
                    lecturesDetails.setLength(0);
                } else {
                    lecturesDuration += ReportEntry.timeStampInMinutes(reportEntries.get(++i))
                            - ReportEntry.timeStampInMinutes(reportEntries.get(--i));
                    lecturesDetails.append(reportEntries.get(i).getActivity() + ": "
                            + (ReportEntry.timeStampInMinutes(reportEntries.get(++i))
                            - ReportEntry.timeStampInMinutes(reportEntries.get(--i))) + " минут "
                            + ceil((ReportEntry.timeStampInMinutes(reportEntries.get(++i))
                            - ReportEntry.timeStampInMinutes(reportEntries.get(--i)))
                            / courseDayDuration * 100) + "%\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}