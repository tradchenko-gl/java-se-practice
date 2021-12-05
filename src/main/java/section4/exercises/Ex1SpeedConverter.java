package section4.exercises;

public class Ex1SpeedConverter {

    public static void main(String[] args) {
        double kilomerters = -9;

        long milesPerHour = toMilesPerHour(kilomerters);
        System.out.println(milesPerHour);

        printConversion(kilomerters);

    }

    public static long toMilesPerHour (double kilometersPerHour) {
        long milesPerHour = -1;
        double milesInOneKm = 1.609;

        if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour/milesInOneKm);
        }

        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else
            System.out.println("Invalid Value");
    }
}
