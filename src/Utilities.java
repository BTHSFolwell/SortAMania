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
}
