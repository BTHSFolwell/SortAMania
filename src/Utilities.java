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
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot = partition(arr,left,right);

            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot + 1, right);
        }
    }
    public static void quickSortMedians(int[] arr, int[][] arr2, int left, int right){
        if(left < right){
            int pivot = partitionMedians(arr, arr2, left, right);
            quickSortMedians(arr,arr2,left,pivot-1);
            quickSortMedians(arr,arr2,pivot + 1, right);
        }
    }
    public static int partitionMedians(int[] arr, int[][] arr2, int left, int right){
        int pivot = arr[right];
        int i = left -1;
        for(int j = left; j < right; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i ,j);
                swapMedians(arr2, i, j, i, j);
            }
        }
        swap(arr, i+1, right);
        swapMedians(arr2, i+1, right, i+1, right);
        return i+1;
    }
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
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
    public static void swapMedians(int[][] array, int i1, int j1, int i2, int j2) {
        int tempObject = array[i1][j1];
        array[i1][j1] = array[i2][j2];
        array[i2][j2] = tempObject;
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
}
