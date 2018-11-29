public class Team6SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr){
        Utilities.quickSort(arr, 0, arr.length - 1);
        if(arr.length % 2 == 1){
            int idx = (int)Math.floor(arr.length / 2);
            return arr[idx];
        }else{
            int idx = (int)Math.floor(arr.length /2);
            int idx2 = idx - 1;
            int median = (int)Math.floor((arr[idx] + arr[idx2]) / 2);
            return median;
        }
    }
    public int challengeTwo(String[] arr, String query){
        quickSortString(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            if (Arrays.asList(arr).contains(query))
                return i;
        }
        return -1;
    }

    public int challengeThree(int[] arr){
        Utilities.insertionSort(arr);
        if(arr.length % 2 == 1){
            int idx = (int)Math.floor(arr.length / 2);
            return arr[idx];
        }else{
            int idx = (int)Math.floor(arr.length /2);
            int idx2 = idx - 1;
            int median = (int)Math.floor((arr[idx] + arr[idx2]) / 2);
            return median;
        }
    }

    public int challengeFour(int[][] arr){

    }

    public int challengeFive(Comparable[] arr, Comparable query){

    }

    public String greeting(){

    }
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


}
