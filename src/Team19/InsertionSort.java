package Team19;

public class InsertionSort {
    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void insertionSort(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                InsertionSort.swap(arr, j, j - 1);
                j = j - 1;
            }
            i = i + 1;
        }
    }
}