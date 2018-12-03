public class Utilities {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i ++){
            for(int j = i; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j, j-1);
                }else{
                    j = 0;
                }
            }
        }
    }
    public static int[][] gen2dInt(int count1, int count2){
        int[][] arr = new int [count1][count2];
        for(int i = 0; i < count1; i++){
            for(int j = 0; j < count2; j++){
                arr[i][j] = randInt(0, 10000);
            }
        }
        return arr;
    }
    public static void quickSortComparable(int[] arr, int left, int right){

    }
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot + 1, right);
        }
    }
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[Utilities.randInt(left,right)];
        int i = left -1;
        for(int j = left; j < right; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i ,j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    public static void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void quickSortMedians(int[] medians, int[][] arr, int left, int right){
        if(left < right){
            int pivot = partitionMedians(medians, arr, left, right);
            quickSortMedians(medians,arr,left,pivot-1);
            quickSortMedians(medians,arr,pivot + 1, right);
        }
    }
    public static int partitionMedians(int[] medians, int[][] arr, int left, int right){
        int pivot = medians[Utilities.randInt(left,right)];
        int i = left -1;
        for(int j = left; j < right; j++){
            if(medians[j] <= pivot){
                i++;
                swap(medians, i ,j);
                swap2D(arr,i,j);
            }
        }
        swap(medians, i+1, right);
        swap2D(arr, i+1, right);
        return i+1;
    }
    public static void swap2D(int[][] arr, int i, int j) {
        for(int y = 0; y < arr.length; y++){
            int temp = arr[i][y];
            arr[i][y] = arr[i][j];
            arr[i][j] = temp;
        }
    }
    public static int[] genIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            int randInt = randInt(1, 10000);
            arr[i] = randInt;
        }
        return arr;
    }
    public static int randInt(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    public static void quickSortString(String[] arr, int left, int right) {
        if (left < right) {
            int pivot = partitionString(arr, left, right);
            quickSortString(arr, left, pivot-1);
            quickSortString(arr, pivot+1, right);
        }
    }
    public static int partitionString(String[] arr, int left, int right) {
        String pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swapString(arr, i, j);
            }
        }
        swapString(arr, i+1, right);
        return i+1;
    }

    public static void swapString(String[] list1, int i, int j) {
        String temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }
    public static int[] mostlySortedArr(int sorted, int unsorted){
        int[] arr = new int[sorted + unsorted];
        for(int i = 0; i < sorted; i++){
            arr[i] = i;
        }
        for(int i = sorted; i < sorted + unsorted; i++){
            arr[i] = randInt(0,100000);
        }
        return arr;
    }
    public static Comparable[] genComparableArr(int count){
        Comparable[] arr = new Comparable[count];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Thingy();
        }
        return arr;
    }
}
