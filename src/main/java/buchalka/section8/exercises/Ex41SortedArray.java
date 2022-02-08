package buchalka.section8.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex41SortedArray {
    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers (int [] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxPosition = j;
                }
            }
            if (i != maxPosition) {
                int temp = array[i];
                array[i] = array[maxPosition];
                array[maxPosition] = temp;
            }
        }
        return array;
    }

}
