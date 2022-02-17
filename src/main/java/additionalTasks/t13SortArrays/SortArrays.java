package additionalTasks.t13SortArrays;

import java.util.Arrays;

public class SortArrays {

    //================ Bubble sort =======================
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

    //======================= quicksort ===========================
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

    //========================= mergersort ===================
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else {
            int mid = arr.length/2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            return merge(mergeSort(left), mergeSort(right));
        }

    }

    private static int[] merge(int [] left,int[] right) {
        int length = left.length + right.length;
        int[] sortedArray = new int[length];
        int i = 0;
        int j = 0;
        int y = 0;

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                sortedArray[y] = left[i];
                i++;
            } else {
                sortedArray[y] = right[j];
                j++;
            }
            y++;
        }

        while (i < left.length)  {
            sortedArray[y] = left[i];
            i++;
            y++;
        }

        while (j < right.length) {
            sortedArray[y] = right[j];
            j++;
            y++;
        }

        return sortedArray;
    }

}
