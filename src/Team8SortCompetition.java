public class Team8SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr) {
        SortingAlgorithms.quickSort(arr);
        return getMiddle(arr);
    }

    public int challengeTwo(String[] arr, String query) {
        SortingAlgorithms.quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(query))
                return i;
        }
        return -1;
    }

    public int challengeThree(int[] arr) {
        SortingAlgorithms.quickSort(arr);
        return getMiddle(arr);
    }

    public int challengeFour(int[][] arr) {
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            SortingAlgorithms.quickSort(arr[i]);
            medians[i] = getMiddle(arr[i]);
        }
        challengeFourQuickSort(medians, arr);
        return getMiddle(medians);
    }

    /**
     * A modified version of quick sort that sorts arrays in parallel,
     * the {@code arr2} based on the swaps of the {@code arr}.
     *
     * @param arr  the arr which determines the swaps.
     * @param arr2 the arr which follows the swaps.
     */
    private void challengeFourQuickSort(int[] arr, int[][] arr2) {
        challengeFourQuickSort(arr, arr2, 0, arr.length - 1);
    }

    private void challengeFourQuickSort(int[] arr, int[][] arr2, int left, int right) {
        if (left < right) {
            int pivot = challengeFourPartition(arr, arr2, left, right);

            challengeFourQuickSort(arr, arr2, left, pivot - 1);
            challengeFourQuickSort(arr, arr2, pivot + 1, right);
        }
    }

    private static int challengeFourPartition(int[] arr, int[][] arr2, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                SortingAlgorithms.swap(arr, i, j);
                SortingAlgorithms.swap(arr2, i, j);
            }
        }
        SortingAlgorithms.swap(arr, i + 1, right);
        SortingAlgorithms.swap(arr, i + 1, right);
        return i + 1;
    }

    public int challengeFive(Thingy[] arr, Thingy query) {
        challengeFiveQuickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(query))
                return i;
        }
        return -1;
    }

    private void challengeFiveQuickSort(Thingy[] arr) {
        challengeFiveQuickSort(arr, 0, arr.length - 1);
    }

    static void challengeFiveQuickSort(Thingy[] arr, int left, int right) {
        if (left < right) {
            int pivot = challengeFivePartition(arr, left, right);

            challengeFiveQuickSort(arr, left, pivot - 1);
            challengeFiveQuickSort(arr, pivot + 1, right);
        }
    }

    private static int challengeFivePartition(Thingy[] arr, int left, int right) {
        Thingy pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                SortingAlgorithms.swap(arr, i, j);
            }
        }
        SortingAlgorithms.swap(arr, i + 1, right);
        return i + 1;
    }

    public String greeting() {
        return "Hello";
    }

    /**
     * Returns the median of an array, assuming the array passed is already sorted.
     * If the array is even, the median is the average between the middle two integers.
     *
     * @param arr a sorted array.
     * @return the median of the array passed.
     */
    private int getMiddle(int[] arr) {
        if (arr.length % 2 == 0)
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        return arr[arr.length / 2];
    }
}