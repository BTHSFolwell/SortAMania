import Team19.CountingSort;
import Team19.InsertionSort;
import Team19.QuickSort;
import Team19.Utilities;

import java.util.Arrays;

public class Team19SortCompetition extends SortCompetition {
    public int challengeOne(int[] arr) {
        CountingSort.countingSort(arr);
        return Utilities.calculateMedian(arr);
    }

    public int challengeTwo(String[] arr, String query) {
        QuickSort.quickSort(arr, 0, arr.length - 1);
        return Arrays.binarySearch(arr, query);
    }

    public int challengeThree(int[] arr) {
        InsertionSort.insertionSort(arr);
        return Utilities.calculateMedian(arr);
    }

    public int challengeFour(int[][] arr) {
        for (int[] arr0 : arr) CountingSort.countingSort(arr0);
        QuickSort.quickSort(arr, 0, arr.length - 1);
        return Utilities.calculateMedian(arr);
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        QuickSort.quickSort(arr, 0, arr.length - 1);
        return Arrays.binarySearch(arr, query);
    }

    public String greeting() {
        return "Hello.";
    }
}
