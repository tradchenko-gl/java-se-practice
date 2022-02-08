package buchalka.section5.challenges;

import java.util.Scanner;

public class ChReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countValid = 1;
        int sum = 0;

        while (countValid <= 10) {
            System.out.println("Enter number #" + countValid);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                countValid ++;
            } else {
                System.out.println("Invalid Value");
                countValid = countValid;
            } scanner.nextLine();

        }
        System.out.println("Sum of entered number is " + sum);
        scanner.close();
    }
}
