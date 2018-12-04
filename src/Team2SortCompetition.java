import java.util.*;

public class Team2SortCompetition extends SortCompetition {
    public double challengeOne(int[] arr){
        quickSort(arr,0,arr.length-1);
        return getMedian(arr);
    }

    public int challengeTwo(String[] arr, String query)
    {
        bubbleSort(arr);
        for(int i = 0;i<arr.length-1;i++) {
            if(arr[i].compareTo(arr[i+1]) > 0) {
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr){
        insertionSort(arr);
        return getMedian(arr);
    }

    public int challengeFour(int[][] arr){
        for (int i = 0; i < arr.length; i++)
        {
            quickSort(arr[i], 0, arr[i].length - 1);
        }
        medianSort(arr, 0, arr.length-1);
        return getMedian(arr);
    }

    public int challengeFive(Comparable[] arr, Comparable query){
        return 0;
    }
    public String greeting(){
        return null;
    }

    public static int getMedian(int[][] arr)
    {
        if ((int)(arr.length / 2) + 1 % 2 == 0)
        {
            return (getMedian(arr[arr.length/2-1])+getMedian(arr[arr.length/2])/2);
        }
        else
        {
            return getMedian(arr[arr.length/2]);
        }

    }

    public static int getMedian(int[] arr)
    {
        if ((int)(arr.length / 2) + 1 % 2 == 0)
        {
            return (arr[arr.length/2-1]+arr[arr.length/2])/2;
        }
        else
        {
            return arr[arr.length/2];
        }

    }

    public static void medianSort(int[][] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = medianPartition(arr, left, right);
            medianSort(arr, pivot + 1, right);
        }
    }

    public static int medianPartition(int[][] arr, int left, int right)
    {
        int pivot = getMedian(arr[right]);
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (getMedian(arr[j]) <= pivot)
            {
                i++;
                swapIntTwoD(arr, i, j);
            }
        }
        swapIntTwoD(arr, i+1, right);
        return i+1;
    }

    public static void swapIntTwoD(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapInt(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapDouble(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1].compareTo(arr[j]) < 0) {
                    swapString(arr, j, j + 1);
                }
            }
        }
    }
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swapDouble(arr, i, j);
                }
            }
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);
    }
    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = left; k <= right; k++) {
            arr[k] = temp[k];
        }
    }
    public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot+1, right);
        }

    }
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swapInt(arr, i, j);
            }
        }
        swapInt(arr, i + 1, right);
        return i + 1;
    }


}
