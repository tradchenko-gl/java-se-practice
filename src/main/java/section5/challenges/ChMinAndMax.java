package section5.challenges;

import java.util.Scanner;

public class ChMinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                break;
            } scanner.nextLine();
        }
        System.out.println("Minimum value was " + min + "; Maximum value was " + max);

        scanner.close();
    }
}
