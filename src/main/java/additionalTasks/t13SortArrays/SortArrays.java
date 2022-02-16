package additionalTasks.t13SortArrays;

import java.util.Arrays;

public class SortArrays {

    public static void bubbleSort(int[] arr) {
        int arrSize = arr.length;

        for(int j = 0; j < arrSize; j++) {
            for (int i = 0; i < arrSize-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static int partition (int[] arr, int start, int end) {
        int pivot = arr[end];
        int temp;
        int i = start;
        int j = end-1;
        while(true) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] >= pivot) {
                j--;
            }
            if (i >= j) {
                break;
            } else {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;

        return i;
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }

}
