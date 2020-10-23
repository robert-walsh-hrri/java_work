public class TimeDuration {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        if (minutes > 59) {
            return (int)(minutes / 60) + "h " + (int)(minutes % 60) + "m " + seconds + "s";
        } else {
            return "0h " + minutes + "m " + seconds + "s";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        return getDurationString((int)(seconds / 60), (int)(seconds % 60));
    }
}
