package buchalka.section5.exersises;

public class Ex18SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(55, 55));
    }

    public static boolean hasSharedDigit (int number1, int number2) {

        if ((number1 >= 10) && (number1 <= 99) && (number2 >= 10) && (number2 <= 99)) {
            int newNumber2 = number2;
            while (number1 >= 1) {
                int digit1 = number1 % 10;
                while (newNumber2 >= 1) {
                    int digit2 = newNumber2 % 10;
                    if (digit1 == digit2) {
                        return true;
                    }
                    newNumber2 = newNumber2 / 10;
                }
                number1 = number1 / 10;
                newNumber2 = number2;
            }
        }

        return false;
    }
}
