public class Team4SortCompetition extends SortCompetition{
    //Challenge One
    @Override
    public int challengeOne(int[] arr) { //Standard sort and process--Quicksort
        quickSort(arr,0,9999);
        return 0;
    }

    public void quickSort(int[] arr, int low, int high){
        if(low< high){
            int p = partition(arr,low, high);

            quickSort(arr,low, p - 1);
            quickSort(arr, p+1, high);
        }
    }

    public int partition( int[] arr, int  left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for(int j = left; j <right; j++){
            if(arr[j] <=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp2 = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp2;
        return i+1;
    }

    public static int[] randomIntsArr(int num){
        int []arr = new int[num];
        for(int i =0; i <arr.length; i++){
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    @Override
    public int challengeTwo(String[] arr, String query) { //string sorting and searching
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) { //mostly sorted big array
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {//multidimensional array
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) { //Mystery sort and search
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }
}
