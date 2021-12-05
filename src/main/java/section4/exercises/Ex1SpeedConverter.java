package section4.exercises;

public class Ex1SpeedConverter {

    public static void main(String[] args) {
        double kilomerters = 1.5;

        long milesPerHour = toMilesPerHour(kilomerters);
        System.out.println(milesPerHour);

    }

    public static long toMilesPerHour (double kilometersPerHour) {
        long milesPerHour = -1;
        double milesInOneKm = 1.609;

        if (kilometersPerHour > 0) {
            milesPerHour = Math.round(kilometersPerHour*milesInOneKm);
        }

        return milesPerHour;
    }
}
