package buchalka.section4.exercises;

public class Ex6EqualSumChecker {

    public static boolean hasEqualSum (int number1, int number2, int number3) {
        boolean isSumEqual = false;
        int sum = (number1 + number2);

        if (sum == number3) {
            isSumEqual = true;
        }
        return isSumEqual;
    }
}
