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
        int[] medians = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            Utilities.quickSort(arr[i], 0, arr[i].length-1);
            if(arr[i].length % 2 == 1){
                int idx = (int)Math.floor(arr[i].length / 2);
                //return arr[i][idx];
                medians[i] = arr[i][idx];
            }else{
                int idx = (int)Math.floor(arr[i].length /2);
                int idx2 = idx - 1;
                int median = (int)Math.floor((arr[i][idx] + arr[i][idx2]) / 2);
                //return median;
                medians[i] = median;
            }
        }
        for (int i = 0; i < medians.length; i++) {
            Utilities.quickSortMedians(medians,arr, 0, medians.length - 1);
        }
        for (int i = 0; i < medians.length; i++) {
            if(medians.length % 2 == 1){
                int idx = (int)Math.floor(medians.length / 2);
                return medians[idx];
            }else{
                int idx = (int)Math.floor(medians.length /2);
                int idx2 = idx - 1;
                int median = (int)Math.floor((medians[idx] + medians[idx2]) / 2);
                return median;
            }
        }
        return 0;
    }

    public int challengeFive(Comparable[] arr, Comparable query){
        return 0;
    }

    public String greeting(){
        return "Hello!";
    }
}
