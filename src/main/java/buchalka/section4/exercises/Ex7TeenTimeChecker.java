package buchalka.section4.exercises;

public class Ex7TeenTimeChecker {

    public static boolean isTeen (int age) {
        boolean teen = false;
        int min = 13;
        int max = 19;

        if (age >= min && age <=max)
            teen = true;

        return teen;
    }

    public static boolean hasTeen (int age1, int age2, int age3) {
        boolean isTeen = false;

        if (isTeen (age1) || isTeen (age2) || isTeen (age3))
            isTeen = true;

        return isTeen;
    }
}
