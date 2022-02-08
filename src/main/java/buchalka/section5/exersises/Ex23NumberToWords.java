package buchalka.section5.exersises;

public class Ex23NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(reverse(0));
        numberToWords(0);
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int revertNumber = reverse(number);
            int i = getDigitCount(number) - getDigitCount(revertNumber);
            if (number == 0) {
                System.out.println("Zero");
            }
            while (revertNumber >= 1) {
                int lastDigit = revertNumber % 10;
                revertNumber = revertNumber / 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            } if (i > 0) {
                while (i > 0) {
                    System.out.println("Zero");
                    i--;
                }
            }
        }

    }

    public static int reverse (int number) {
        int reverseNumber = 0;
        int lastDigit;
            while (Math.abs(number) >= 1) {
                lastDigit = number % 10;
                number = number / 10;
                reverseNumber = reverseNumber * 10;
                reverseNumber += lastDigit;
            }

        return reverseNumber;
    }

    public static int getDigitCount (int number) {
        int digitsCount = 0;
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return 1;
        }
        while (number >= 1) {
            number = number / 10;
            digitsCount++;
        }

        return digitsCount;
    }
}
