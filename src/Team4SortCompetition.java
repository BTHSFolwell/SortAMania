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

    //Challenge Two
    @Override
    public int challengeTwo(String[] arr, String query) { //string sorting and searching
        mergeSort(arr, query);
        return -1;
    }

    public static void mergeSort(String[] elements, String query){
        int n = elements.length;
        String[] temp = new String[n];
        mergeSortHelper(elements, 0, n-1, query, temp);
        for(int x = 0; x < elements.length; x++){
            System.out.print(elements[x] + " ");
        }
        System.out.print("\n");

    }

    private static void mergeSortHelper(String[] elements, int from, int to, String match, String[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, match, temp);
            mergeSortHelper(elements, middle + 1, to, match, temp);
            merge(elements, from, middle, to, match, temp);
        }
    }

    private static void merge(String[] elements, int from, int mid, int to, String match, String[] temp){
        int i = from;
        int j = mid + 1;
        int k  = from;
        while (i<= mid && j <=to){
            if(elements[i].compareTo(elements[j]) < 0){
                temp[k] = elements[i];
                i++;
            }
            else{
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <=to){
            temp[k] = elements[j];
            j++;
            k++;
        }
        for(k = from; k <= to; k++){
            elements[k] = temp[k];
            if (temp[k].equals(match)) {
                System.out.println("THIGNEINGIEGNGI");
                System.out.println(k);
            }
        }
    }

    public static String[] randomStringArr(int num, int length){
        String arr[] = new String[num];
        while(num>0){
            int i = 0;
            String s = "";
            while(i<length){
                char c = (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
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
