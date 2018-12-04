import java.util.Arrays;

public class Team11SortCompetition extends SortCompetition {

    public static void swapInt(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapInt(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for(int j  = left; j <right;j++) {
            if(arr[j]<=pivot) {
                i++;
                swapInt(arr,i,j);
            }
        }
        swapInt(arr,i+1,right);
        return i+1;
    }


    public static void quickSort(int[] arr,int left, int right) {
        if (left < right) {
            int pivot = partition(arr,left,right);

            quickSort(arr, left,pivot - 1 );
            quickSort(arr,pivot + 1, right);
        }
    }
    public static void quickSort(int[] arr,int left, int right, int [][] arr2) {
        if (left < right) {
            int pivot = partition(arr,left,right,arr2);

            quickSort(arr, left,pivot - 1,arr2);
            quickSort(arr,pivot + 1, right,arr2);
        }
    }
    public static void insertionSort(int[] list1, int[][] arr) {
        for (int i = 1; i < list1.length; i++) {
            int temp = list1[i];
            int j;
            for (j = i - 1; j >= 0 && temp < list1[j]; j--) {
                swapInt(arr,j+1,j);
                list1[j + 1] = list1[j];
            }
            list1[j + 1] = temp;
        }
    }
    public static int partition(int[] arr, int left, int right, int[][] arr2) {
        int pivot = arr[right];
        int i = left - 1;
        for(int j  = left; j <right;j++) {
            if(arr[j]<=pivot) {
                i++;
                swapInt(arr,i,j);
                swapInt(arr2,i,j);
            }
        }
        swapInt(arr,i+1,right);
        return i+1;
    }
    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    swapString(arr, j, j + 1);
                }
            }
        }
    }

    public static int median(int[] arr)
    {
        int mid = 0;
        if(arr.length % 2 == 0) {
            mid = (arr[arr.length / 2 + 1] + arr[arr.length / 2]) / 2;
        }
        else
        {
            mid = arr[arr.length / 2];
        }
        return mid;
    }

    public int challengeOne(int[] arr) {
        quickSort(arr,0,arr.length-1);
        return median(arr);
    }

    public int challengeTwo(String[] arr, String query) {
        bubbleSort(arr);
        for(int i = 0;i<arr.length-1;i++) {
            if(arr[i].compareTo(arr[i+1]) > 0) {
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr) {
        quickSort(arr,0, arr.length-1);
        int mid = 0;
        if(arr.length % 2 == 0)
            for(int i = 0;i<arr.length/2;i++) {
                mid = (arr[i] + arr[i+1])/2;
            }
        else {
            for(int i = 0;i<arr.length/2;i++) {
                mid = arr[i+1];
            }
        }
        return mid;
    }

    public int challengeFour(int[][] arr) {
        int[] median = new int[arr.length];

        for(int i=0; i < arr.length; i++) {
            median[i] = challengeOne(arr[i]);
        }
        insertionSort(median,arr);
        return 0;
    }


    public int challengeFive(Comparable[] arr, Comparable query) {
        return -1;
    }

    public String greeting() {
        return "Hello!";
    }
}