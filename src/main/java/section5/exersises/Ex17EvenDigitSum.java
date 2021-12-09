package section5.exersises;

public class Ex17EvenDigitSum {

    public static void main(String[] args) {
        getEvenDigitSum(9234);
    }

    public static int getEvenDigitSum (int number) {
        int evenSum = 0;
        int digit;

        if (number < 0) {
            return -1;
        } else {

            while (number >= 1) {
                digit = number % 10;

                if ((digit % 2) == 0) {
                    evenSum += digit;
                }
                number = number / 10;
            }
        }

        return evenSum;
    }
}
