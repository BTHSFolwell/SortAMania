import java.util.Arrays;

public class Team14SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        Sorts.quickSort(arr,0,arr.length-1);

        int median = (arr[arr.length/2] + arr[arr.length/2 - 1])/2;
            return median;

    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        Sorts.bubbleSort(arr);
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i].compareTo(query) == 0)
            {
                return i ;
            }
        }
        return -1;
    }

    @Override
    public int challengeThree(int[] arr) {
        Sorts.quickSort(arr,0,arr.length-1);

       int median = (arr[arr.length/2] + arr[arr.length/2 - 1])/2;

        return median;

    }

    @Override
    public int challengeFour(int[][] arr) {

        int width = arr.length;
        int[] medians = new int[width];
        for(int i=0;i<arr.length;i++)
        {
            Sorts.quickSort(arr[i],0,arr[1].length-1);
            int median = (arr[i][arr[i].length/2] + arr[i][arr[i].length/2 - 1])/2;

            medians[i] = median;
        }
        //Sorts.arrPrint2d(arr);

        Sorts.quickSort(medians,0,medians.length-1);
        System.out.println(Arrays.toString(medians));

        int finalmedian = (medians[medians.length/2] + medians[(medians.length/2)-1])/2;
        return finalmedian;

    }
    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        
    }

    @Override
    public String greeting() {
        return null;
    }
}
