import java.util.*;

public class Team2SortCompetition extends SortCompetition {
    public double challengeOne(int[] arr){
        radixSort(arr);
        return (arr[arr.length/2-1+(arr.length%2)]+arr[arr.length/2])/2;
    }

    public int challengeTwo(String[] arr, String query){
        return 0;
    }

    public int challengeThree(int[] arr){
        return 0;
    }

    public int challengeFour(int[][] arr){
        return 0;
    }

    public int challengeFive(Comparable[] arr, Comparable query){
        return 0;
    }
    public String greeting(){
        return null;
    }

    public static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static void swapInt(int list1[], int i, int j) {
        int temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }
    public static void swapDouble(double list1[], int i, int j) {
        double temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }
    public static void swapString(String list1[], int i, int j) {
        String temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }
    public static String randStr() {
        int wordLength = randInt(5) + 3;
        String result = "";
        for (int i = 0; i < wordLength; i++) {
            result += alphabet[randInt(25)];
        }
        return result;
    }
    public static int randInt(int max) {
        return (int) (Math.random() * (max + 1));
    }
    public static double randDoub(int max) {
        return Math.random() * (max + 1);
    }
    public static int[] randIntArr(int count, int max) {
        int[] list1 = new int[count];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = randInt(max);
        }
        return list1;
    }
    public static double[] randDoubArr(int count, int max) {
        double[] list1;
        list1 = new double[count];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = randDoub(max);
        }
        return list1;
    }
    public static String[] randStrArr(int count) {
        String[] list1;
        list1 = new String[count];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = randStr();
        }
        return list1;
    }

    public static void bubbleSort(String[] list1) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1.length - 1; j++) {
                if (list1[j + 1].compareTo(list1[j]) < 0) {
                    swapString(list1, j, j + 1);
                }
            }
        }
    }
    public static void selectionSort(double[] list1) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = i + 1; j < list1.length; j++) {
                if (list1[i] > list1[j]) {
                    swapDouble(list1, i, j);
                }
            }
        }
    }
    public static void insertionSort(int[] list1) {
        for (int i = 1; i < list1.length; i++) {
            int temp = list1[i];
            int j;
            for (j = i - 1; j >= 0 && temp < list1[j]; j--) {
                list1[j + 1] = list1[j];
            }
            list1[j + 1] = temp;
        }
    }
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);
    }
    public static void mergeSortHelper(int[] list1, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortHelper(list1, left, mid, temp);
            mergeSortHelper(list1, mid + 1, right, temp);
            merge(list1, left, mid, right, temp);
        }
    }
    public static void merge(int[] list1, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (list1[i] < list1[j]) {
                temp[k] = list1[i];
                i++;
            } else {
                temp[k] = list1[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = list1[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = list1[j];
            j++;
            k++;
        }
        for (k = left; k <= right; k++) {
            list1[k] = temp[k];
        }
    }
    public static void quickSort(int[] list1, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(list1, left, right);

            quickSort(list1, left, pivot -1);
            quickSort(list1, pivot+1, right);
        }

    }
    public static int partition(int[] list1, int left, int right) {
        int pivot = list1[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (list1[j] <= pivot) {
                i++;
                swapInt(list1, i, j);
            }
        }
        swapInt(list1, i + 1, right);
        return i + 1;
    }
    public static void radixSort(int[] list1){
        int m = getMax(list1);
        for(int exp = 1; m/exp>0;exp*=10){
            countSort(list1,exp);
        }
    }
    public static int getMax(int[] list1){
        int max = list1[0];
        for(int i = 1; i < list1.length; i++){
            if(list1[i]>max){
                max = list1[i];
            }
        }
        return max;
    }
    public static void countSort(int[] list1, int exp){
        int output[] = new int[list1.length];
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
        for(i = 0; i < list1.length; i++){
            count[(list1[i]/exp)%10]++;
        }
        for(i=1;i<10;i++){
            count[i] += count[i-1];
        }
        for(i=list1.length-1;i>=0;i--){
            output[count[(list1[i]/exp)%10]-1]=list1[i];
            count[(list1[i]/exp)%10]--;
        }
        for(i=0; i<list1.length;i++){
            list1[i]=output[i];
        }
    }

    public static int sequentialSearch(int[] list1, int target){
        for(int j = 0; j < list1.length; j++){
            if(list1[j]==target){
                return j;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] list1, int target){
        int left = 0;
        int right = list1.length-1;
        while ( left <= right){
            int middle = (left+right)/2;
            if(target < list1[middle]){
                right = middle - 1;
            }
            else if( target > list1[middle]){
                left = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
