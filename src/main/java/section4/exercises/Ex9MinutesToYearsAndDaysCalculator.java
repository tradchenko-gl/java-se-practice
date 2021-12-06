package section4.exercises;

public class Ex9MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays (long minutes) {
        long years = 0;
        long days = 0;
        String minStr;
        String yearsStr;
        String daysStr;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            years = minutes/60/24/365;
            days = minutes/60/24 - years*365;

            minStr = minutes + " min = ";
            yearsStr = years + " y and ";
            daysStr = days + " d";

            System.out.println(minStr + yearsStr + daysStr);
        }

    }

}
