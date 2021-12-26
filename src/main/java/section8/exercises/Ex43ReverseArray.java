package section8.exercises;

import java.util.Arrays;

public class Ex43ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        reverse(array);
    }

    private static void reverse(int[] array) {
        int maxPosition = array.length-1;

        System.out.println("Array = " + Arrays.toString(array));

        for (int i = 0; i < (array.length)/2; i++) {
            int temp = array[i];
            array[i] = array[maxPosition-i];
            array[maxPosition-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
