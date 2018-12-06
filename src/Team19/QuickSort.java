package Team19;

public class QuickSort {
    private static void swap(int[] arr, int i0, int i1) {
        int temp = arr[i0];
        arr[i0] = arr[i1];
        arr[i1] = temp;
    }

    private static void swap(Comparable[] arr, int i0, int i1) {
        Comparable temp = arr[i0];
        arr[i0] = arr[i1];
        arr[i1] = temp;
    }

    private static void swap(int[][] arr, int i0, int i1) {
        int[] temp = arr[i0];
        arr[i0] = arr[i1];
        arr[i1] = temp;
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                QuickSort.swap(arr, i, j);
            }
        }
        QuickSort.swap(arr, i + 1, right);
        return i + 1;
    }

    private static int partition(Comparable[] arr, int left, int right) {
        Comparable pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                QuickSort.swap(arr, i, j);
            }
        }
        QuickSort.swap(arr, i + 1, right);
        return i + 1;
    }

    private static int partition(int[][] arr, int left, int right) {
        int[] pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (Utilities.calculateMedian(arr[j]) <= Utilities.calculateMedian(pivot)) {
                i++;
                QuickSort.swap(arr, i, j);
            }
        }
        QuickSort.swap(arr, i + 1, right);
        return i + 1;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = QuickSort.partition(arr, left, right);

            QuickSort.quickSort(arr, left, pivot - 1);
            QuickSort.quickSort(arr, pivot + 1, right);
        }
    }

    public static void quickSort(Comparable[] arr, int left, int right) {
        if (left < right) {
            int pivot = QuickSort.partition(arr, left, right);

            QuickSort.quickSort(arr, left, pivot - 1);
            QuickSort.quickSort(arr, pivot + 1, right);
        }
    }

    public static void quickSort(int[][] arr, int left, int right) {
        if (left < right) {
            int pivot = QuickSort.partition(arr, left, right);

            QuickSort.quickSort(arr, left, pivot - 1);
            QuickSort.quickSort(arr, pivot + 1, right);
        }
    }
}
