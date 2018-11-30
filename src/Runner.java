import java.util.Arrays;

public class Runner {
    public static void main(String[] args){

        //Challenge One
        SortCompetition team11 = new Team11SortCompetition();
        int[] randIntArr = randomIntsArr(10000);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team11.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time  + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);

        //Challenge Two


        //Challenge Three


        //Challenge Four


        //Challenge Five
    }
    public static int[] randomIntsArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }
    public static void printArr(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

}