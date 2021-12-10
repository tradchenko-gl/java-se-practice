package section5.exersises;

public class Ex22PerfectNumber {

    public static boolean isPerfectNumber (int number) {
        if (number >= 1) {
            int sumOfDivisors = 0;
            for (int i = number-1; i > 0; i--) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            if (number == sumOfDivisors) return true;
        } return false;
    }
}
