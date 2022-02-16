package additionalTasks.t7Permutaions;

import java.util.Arrays;

public class Permutations {

    public static void printAllPermutations(int n, String s, char delimiter) {
        if (n == 1) {
            printString(s, delimiter);
        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllPermutations(n - 1, s, delimiter);
                if (n % 2 == 0) {
                    s = swap(s, i, n - 1);
                } else {
                    s = swap(s, 0, n - 1);
                }
            }
            printAllPermutations(n - 1, s, delimiter);
        }
    }

    private static void printString(String input, char delimiter) {
        int i = 0;
        for (; i < input.length(); i++) {
            System.out.print(input.charAt(i));
        }
        System.out.print(delimiter);
    }

    private static String swap(String input, int a, int b) {
        String newS;
        char[] chArr = input.toCharArray();
        char tmp = chArr[a];
        chArr[a] = chArr[b];
        chArr[b] = tmp;
        return newS = new String(chArr);
    }



    /*public static void printAllPermutations (String s) {
        int counter = 0;
        //put all the words to array
        String[] words = s.split(" ");
        String[] tempWords;
        //Initial order:
        //System.out.println("Before swaps: ");
        printArr(words);
        //from 0 position - swap all from 1st
        for(int i = 1; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                tempWords = Arrays.copyOf(swapElements(words, i, j), words.length);
                printArr(tempWords);
                counter++;
            }
        }
        //from 1st position - swap current element with 0 element
        for(int i = 1; i < words.length; i++) {
            //System.out.println("\n Swap " + i + " element with 0 element");
            tempWords = swapElements(words, i, 0);
            printArr(tempWords);
            counter++;
            //then swap remaining
            //System.out.println("\n Swap remaining: ");
            for (int j = 1; j < tempWords.length; j++) {
                for(int y = j+1; y< tempWords.length; y++) {
                    tempWords = swapElements(tempWords, j, y);
                    printArr(tempWords);
                    counter++;
                }
            }
        }
        //System.out.println("Total permutations is " + counter);
    }

    private static String[] swapElements(String[] array, int i, int j) {
        String[] newArr = new String[array.length];
        newArr = Arrays.copyOf(array, array.length);
        String temp = newArr[i];
        newArr[i] = newArr[j];
        newArr[j] = temp;
        return newArr;
    }

    private static void printArr(String[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //System.out.print("\n");
    }*/
}
