class SortingAlgorithms {
    /**
     * Swaps the values of an array arr at indexes i and j.
     *
     * @param arr the array to modify.
     * @param i   the index of the value to be moved to index j.
     * @param j   the index of the value to be moved to index i.
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(Thingy[] arr, int i, int j) {
        Thingy temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints out the values of an array, delimited by a space.
     *
     * @param arr    the array to print.
     * @param cutoff the max length of the output. (200 by default)
     */
    static void printArr(int[] arr, int cutoff) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr)
            sb.append(" ").append(i);
        if (cutoff > arr.length)
            System.out.println(sb.substring(1));
        else
            System.out.println(sb.substring(1, cutoff) + "...");
    }

    static void printArr(int[] arr) {
        printArr(arr, 200);
    }

    static void printArr(double[] arr, int cutoff) {
        StringBuilder sb = new StringBuilder();
        for (double d : arr)
            sb.append(" ").append(d);
        if (cutoff > arr.length)
            System.out.println(sb.substring(1));
        else
            System.out.println(sb.substring(1, cutoff) + "...");
    }

    static void printArr(double[] arr) {
        printArr(arr, 200);
    }

    static void printArr(String[] arr, int cutoff) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr)
            sb.append(" ").append(s);
        if (cutoff > arr.length)
            System.out.println(sb.substring(1));
        else
            System.out.println(sb.substring(1, cutoff) + "...");
    }

    static void printArr(String[] arr) {
        printArr(arr, 200);
    }

    static void printArr(int[][] arr, int cutoff) {
        StringBuilder sb = new StringBuilder();
        for (int[] i : arr) {
            StringBuilder sbi = new StringBuilder();
            for (int j : i)
                sbi.append(j).append(" ");
            if (cutoff > i.length)
                sb.append(sbi);
            else
                sb.append(sbi.substring(0, cutoff) + "...");
            sb.append("\n");
        }
        if (sb.length() >= 600)
            System.out.println(sb.substring(0, 600) + "\n...");
        else
            System.out.println(sb);
    }

    static void printArr(int[][] arr) {
        printArr(arr, 200);
    }

    static void printArr(Thingy[] arr, int cutoff) {
        StringBuilder sb = new StringBuilder();
        for (Thingy t : arr)
            sb.append(" ").append(t);
        if (cutoff > arr.length)
            System.out.println(sb.substring(1));
        else
            System.out.println(sb.substring(1, cutoff) + "...");
    }

    static void printArr(Thingy[] arr) {
        printArr(arr, 200);
    }

    /**
     * Creates an array of {@code len} random integers
     * in the range [{@code min}, {@code max}].
     *
     * @param len    the length of the array.
     * @param min    the minimum integer value. (0 by default)
     * @param max    the max integer value. ({@code len} by default)
     * @param sorted the percent of the array to be sorted. (0.0 by default)
     * @return an array of randomly sorted integers.
     */
    static int[] getRandIntArr(int len, int min, int max, double sorted) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = min + (int) (Math.random() * (max - min + 1));
        if (sorted != 0.0) {
            quickSort(arr);
            int swaps = (int) (len * (1.0 - sorted));
            for (int i = 0; i < swaps; i++)
                swap(arr, (int) (Math.random() * arr.length), (int) (Math.random() * arr.length));
        }
        return arr;
    }

    static int[] getRandIntArr(int len, int min, int max) {
        return getRandIntArr(len, min, max, 0.0);
    }

    static int[] getRandIntArr(int len, int max, double sorted) {
        return getRandIntArr(len, 0, max, sorted);
    }

    static int[] getRandIntArr(int len, int max) {
        return getRandIntArr(len, 0, max, 0.0);
    }

    static int[] getRandIntArr(int len, double sorted) {
        return getRandIntArr(len, 0, len, sorted);
    }

    static int[] getRandIntArr(int len) {
        return getRandIntArr(len, 0, len, 0.0);
    }

    /**
     * Creates an array of integers from 1 to {@code len} in random order.
     *
     * @param len the length of the array.
     * @return an array of randomly sorted integers with no repeat values.
     */
    static int[] randIntArr(int len) {
        int[] arr = new int[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int) (Math.random() * len);
            while (arr[randIdx] != 0)
                randIdx = (int) (Math.random() * len);
            arr[randIdx] = i;
        }
        return arr;
    }

    /**
     * Creates an array of doubles from 1.0 to {@code len} in random order.
     *
     * @param len the length of the array.
     * @return an array of randomly sorted doubles.
     */
    static double[] getRandDoubleArr(int len) {
        double[] arr = new double[len];
        for (int i = 1; i <= len; i++) {
            int randIdx = (int) (Math.random() * len);
            while (arr[randIdx] != 0)
                randIdx = (int) (Math.random() * len);
            arr[randIdx] = i;
        }
        return arr;
    }

    /**
     * Creates an array of Strings with random lowercase letters.
     *
     * @param len the length of the array.
     * @param min the minimum possible length of each String. (1 by default)
     * @param max the maximum possible length of each String. (10 by default)
     * @return an array of {@code len} Strings,
     * each of a length from {@code min} to {@code max},
     * composed of random lowercase letters.
     */
    static String[] getRandStringArr(int len, int min, int max) {
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            int strLen = (int) (Math.random() * max + 1 - min) + min;
            for (int j = 0; j < strLen; j++)
                sb.append(Character.toString((char) ((Math.random() * 26) + 97)));
            arr[i] = sb.toString();
        }
        return arr;
    }

    static String[] getRandStringArr(int len) {
        return getRandStringArr(len, 1, 10);
    }

    static String[] getRandStringArr(int len, int strLen) {
        return getRandStringArr(len, strLen, strLen);
    }

    /**
     * Bubble sort iterates through the list, swapping any out of order elements.
     * We continue iterating until no swaps are required. Then the array is sorted!
     *
     * @param list1 The array to sort.
     */
    static void bubbleSort(String[] list1) {
        boolean swap = true;
        for (int i = 0; swap; i++) {
            swap = false;
            for (int j = 0; j < list1.length - i - 1; j++) {
                if (list1[j].compareTo(list1[j + 1]) > 0) {
                    swap(list1, j, j + 1);
                    swap = true;
                }
            }
        }
    }

    /**
     * Selection sort finds the lowest element and mose it to the front of the array.
     * Then searches the rest of the array for the next element, and repeats.
     *
     * @param list1 The array to sort.
     */
    static void selectionSort(double[] list1) {
        int minIdx = 0;
        for (int i = 0; i < list1.length - 1; i++) {
            for (int j = i; j < list1.length; j++) {
                if (list1[j] < list1[minIdx])
                    minIdx = j;
            }
            swap(list1, minIdx, i);
        }
    }

    /**
     * Insertion takes each element from the array,
     * and adds it to the front of the array in the correct order.
     * We need to keep track of where we are inserting elements as we sort.
     *
     * @param list1 The array to sort.
     */
    static void insertionSort(int[] list1) {
        for (int i = 1; i < list1.length; i++) {
            for (int j = i - 1; j > 0 && list1[j] < list1[j - 1]; j--)
                swap(list1, j, j - 1);
        }
    }

    /**
     * Sort an array of integers into ascending order.
     *
     * @param elements an array containing the items to be sorted.
     *                 <p>
     *                 Postcondition: elements contains its original items and items in elements
     *                 are sorted in ascending order.
     */
    static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    /**
     * Sorts elements[from] ... elements[to] inclusive into ascending order.
     *
     * @param elements an array containing the items to be sorted.
     * @param from     the beginning index of the items in elements to be sorted.
     * @param to       the ending index of the items in elements to be sorted.
     * @param temp     a temporary array to use during the merge process.
     *                 <p>
     *                 Precondition:
     *                 (elements.length == 0 or
     *                 0 <= from <= to <= elements.length) and
     *                 elements.length == temp.length
     *                 Postcondition: elements contains its original items and the items in elements
     *                 [from] ... <= elements[to] are sorted in ascending order.
     */
    private static void mergeSortHelper(int[] elements,
                                        int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    /**
     * Merges two adjacent array parts, each of which has been sorted into ascending
     * order, into one array part that is sorted into ascending order.
     *
     * @param elements an array containing the parts to be merged.
     * @param from     the beginning index in elements of the first part.
     * @param mid      the ending index in elements of the first part.
     *                 mid+1 is the beginning index in elements of the second part.
     * @param to       the ending index in elements of the second part.
     * @param temp     a temporary array to use during the merge process.
     *                 <p>
     *                 Precondition: 0 <= from <= mid <= to <= elements.length and
     *                 elements[from] ... <= elements[mid] are sorted in ascending order and
     *                 elements[mid + 1] ... <= elements[to] are sorted in ascending order and
     *                 elements.length == temp.length
     *                 Postcondition: elements contains its original items and
     *                 elements[from] ... <= elements[to] are sorted in ascending order and
     *                 elements[0] ... elements[from − 1] are in original order and
     *                 elements[to + 1] ... elements[elements.length − 1] are in original order.
     */
    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) {
            if (elements[i] < elements[j]) {
                temp[k] = elements[i];
                i++;
            } else {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            elements[k] = temp[k];
        }
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(String[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    static void quickSort(String[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private static int partition(String[] arr, int left, int right) {
        String pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }
}