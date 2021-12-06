package section4.challeges;

public class Ch3SecondsAndMinutes {

    public static void main(String[] args) {

        String hms = getDurationString (0, 0);
        System.out.println(hms);

        hms = getDurationString(0);
        System.out.println(hms);

    }

    public static String getDurationString (int minutes, int seconds) {

        String hoursMinutesSeconds = "Invalid value";
        int hours = 0;

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            hours = Math.round(minutes / 60);
            minutes = minutes - hours*60;

            hoursMinutesSeconds = hours + "h " + minutes + "m " + seconds + "s";
        }

        return hoursMinutesSeconds;
    }

    public static String getDurationString (int seconds) {
        String hoursMinutesSeconds = "Invalid value";
        int minutes = 0;

        if (seconds >= 0) {
            minutes = Math.round(seconds/60);
            seconds = seconds - minutes*60;

            hoursMinutesSeconds = getDurationString(minutes, seconds);
        }

        return hoursMinutesSeconds;

    }

}
