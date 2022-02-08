package buchalka.section4.exercises;

public class Ex3BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        boolean wakeUp = false;

        if (hourOfDay > 23 || hourOfDay < 0) {
            wakeUp = false;
        } else if (barking == true && (hourOfDay < 8 || hourOfDay > 22))
            wakeUp = true;

        return wakeUp;
    }
}
