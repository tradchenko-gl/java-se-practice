package section5.exersises;

import java.util.Scanner;

public class Ex27InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        int sum = 0;
        long avg;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        avg = Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
