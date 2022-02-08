package buchalka.section5.exersises;

public class Ex14SumOdd {

    public static boolean isOdd (int number) {
        boolean numberIsOdd = false;

        if (number < 0) {
            numberIsOdd = false;
        } else if (number % 2 != 0) {
            numberIsOdd = true;
        }

        return numberIsOdd;
    }

    public static int sumOdd (int start, int end) {

        int sum = 0;

        if ((end < start) || (start < 0) || (end < 0)) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
