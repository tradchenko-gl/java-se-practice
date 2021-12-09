package section5.exersises;

public class Ex16FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit (int number) {
        int sum = 0;
        int firstDigit = number;
        int lastDigit = number;

        if (number >= 0) {
            if (number >= 10) {
                lastDigit = number % 10;

                while (number > 9) {
                    number = number/10;
                    firstDigit = number;
                }

            }
            sum = firstDigit + lastDigit;
        } else sum = -1;

        return sum;
    }
}
