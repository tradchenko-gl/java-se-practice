package buchalka.section5.exersises;

public class Ex15PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-7007));

    }

    public static boolean isPalindrome (int number) {
        boolean isPalindromeNumber = false;
        int reverseNumber = 0;
        int lastDigit;
        int newNumber;

        number = Math.abs(number);
        newNumber = number;

        if (number <= 9) {
            isPalindromeNumber = true;
        } else {
            while (newNumber >= 1) {
                lastDigit = (newNumber % 10);
                reverseNumber = reverseNumber * 10;
                reverseNumber += lastDigit;
                newNumber = newNumber/10;
            }
            if (Math.abs(number) == reverseNumber) {
                isPalindromeNumber = true;
            }
        }
        return isPalindromeNumber;
    }
}
