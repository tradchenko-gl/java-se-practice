package additionalTasks.t13SortArrays;

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

    public static void quickSort(int[] arr, int start, int end) {
        int pivot = arr[end/2];
        int pPosition = end/2;
        int temp;
        for (int i = start; i < end; i++) {
            if(arr[i] >= pivot) {
                for (int j = end - 1; j > 0; j--) {
                    if(arr[j] <= pivot) {
                        if (i <= j) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
        if (end/2 > 1) {
            quickSort(arr, 0, end/2-1);
        }
        if(end-end/2 > 1) {
            quickSort(arr,end/2, end);
        }
    }

}
