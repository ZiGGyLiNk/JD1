package ReportBuilder;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        File resourcesDirectory = new File("src", "ReportBuilder");
        File inputFile = new File(resourcesDirectory, "program.log");
        File report1 = new File(resourcesDirectory, "timeperiodsreport.txt");
        File report2 = new File(resourcesDirectory, "activitiespercentagereport.txt");

        ReportPrinter.PrintTimePeriodsReport(ReportFileToList.convertToList(inputFile), report1);
        ReportPrinter.PrintActivitiesPercentageReport(ReportFileToList.convertToList(inputFile), report2);
    }
}