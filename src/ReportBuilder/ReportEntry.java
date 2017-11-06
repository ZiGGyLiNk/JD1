package ReportBuilder;

public class ReportEntry {
    private String timeStamp;
    private String activity;

    public ReportEntry(String timeStamp, String activity) {
        this.timeStamp = timeStamp;
        this.activity = activity;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getActivity() {
        return activity;
    }

    public static int timeStampInMinutes(ReportEntry reportEntry) {
        String[] timeStampSplit = reportEntry.getTimeStamp().split(":");
        return Integer.valueOf(timeStampSplit[0]) * 60 + Integer.valueOf(timeStampSplit[1]);
    }
}