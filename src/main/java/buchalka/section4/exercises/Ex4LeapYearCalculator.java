package buchalka.section4.exercises;

public class Ex4LeapYearCalculator {

    public static boolean isLeapYear (int year) {
        boolean leapYear = false;

        if (year < 1 || year > 9999) {
            leapYear = false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else leapYear = false;
            } else leapYear = true;
        } else leapYear = false;

        return leapYear;
    }
}
