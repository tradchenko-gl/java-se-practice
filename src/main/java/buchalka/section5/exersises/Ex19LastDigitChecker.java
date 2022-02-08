package buchalka.section5.exersises;

public class Ex19LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 32, 42));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if ((isValid(number1)) && (isValid(number2)) && (isValid(number3))) {
            int lastDigit1 = number1 % 10;
            int lastDigit2 = number2 % 10;
            int lastDigit3 = number3 % 10;

            if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit3 == lastDigit2)) {
                return true;
            }

        }
        return false;
    }

    public static boolean isValid (int number) {
        if ((number >= 10) && (number <= 1000)) {
            return true;
        } else return false;
    }
}
