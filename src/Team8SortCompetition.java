public class Team8SortCompetition extends SortCompetition {
    /**
     * challengeOne: Standard sort and process
     * Task: Sort the list and return the median.
     *
     * @param arr an array of 10,000 random integers between 0-10000
     * @return the median of the array.
     */
    public int challengeOne(int[] arr) {
        SortingAlgorithms.quickSort(arr);
        return getMiddle(arr);
    }

    /**
     * challengeTwo: String sorting and searching
     * Task: Sort the list and determine if it contains a given string.
     *
     * @param arr   an array of 10,000 random strings (strings will be of length 5).
     * @param query the string to search for.
     * @return the index of the first instance of {@code str}, or -1 if not found
     */
    public int challengeTwo(String[] arr, String query) {
        SortingAlgorithms.quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(query))
                return i;
        }
        return -1;
    }

    /**
     * challengeThree: Mostly Sorted Big Array
     * Task: Sort the list and return the median.
     *
     * @param arr a mostly sorted array of 100,000 integers (>75% of elements are in the correct order).
     * @return the median of the array.
     */
    public int challengeThree(int[] arr) {
        SortingAlgorithms.quickSort(arr);
        return getMiddle(arr);
    }

    /**
     * challengeFour: Multi-Dimensional sorting
     * Task: Sort each sub-array and then sort the arrays by their median value.
     *
     * @param arr a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000.
     * @return the median of the median array.
     */
    public int challengeFour(int[][] arr) {
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            SortingAlgorithms.quickSort(arr[i]);
            medians[i] = getMiddle(arr[i]);
        }
        challengeFourQuickSort(medians, arr);
        return getMiddle(medians);
    }

    private void challengeFourQuickSort(int[] arr, int[][] arr2) {
        challengeFourQuickSort(arr, arr2, 0, arr.length - 1);
    }

    private void challengeFourQuickSort(int[] arr, int[][] arr2, int left, int right) {
        if (left < right) {
            int pivot = challengeFourPartition(arr, arr2, left, right);

            challengeFourQuickSort(arr, arr2, left, pivot - 1);
            challengeFourQuickSort(arr, arr2,pivot + 1, right);
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

    /**
     * challengeFive: Mystery Sort and Search
     * Task: Sort the array by the compareTo method, and determine if it contains the element given.
     *
     * @param arr an array of 10,000 objects that implement the comparable interface.
     * @return the position of the object, or -1 if not found.
     */
    public int challengeFive(Thingy[] arr, Thingy query) {
        challengeFiveQuickSort(arr);
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

    private int getMiddle(int[] arr) {
        if (arr.length % 2 == 0)
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        return arr[arr.length / 2];
    }
}