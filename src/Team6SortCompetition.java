import javax.rmi.CORBA.Util;
import java.util.Arrays;

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
        Utilities.quickSortString(arr, 0, arr.length-1);
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
