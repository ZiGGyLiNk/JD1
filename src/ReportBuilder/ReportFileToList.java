package ReportBuilder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReportFileToList {

    public static List convertToList(File inputFile) {
        List<ReportEntry> reportEntries = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(inputFile)))) {
            while (scanner.hasNextLine()) {
                Pattern pattern = Pattern.compile("(\\d{2}:\\d{2})\\s([^0-9]+)");
                Matcher matcher = pattern.matcher(scanner.nextLine());
                while (matcher.find()) {
                    reportEntries.add(new ReportEntry(matcher.group(1), matcher.group(2)));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reportEntries;
    }
}