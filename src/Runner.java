import java.sql.SQLOutput;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args){

        SortCompetition team11 = new Team11SortCompetition();

        //Challenge One
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
        String[] randStringArr = randomStringArr(10000,5);

        System.out.println("\nUnsorted:");
        printStringArr(randStringArr);
        int indexNumber = team11.challengeTwo(randStringArr,"fasad");

        time = System.currentTimeMillis();
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time  + " Seconds");
        if(indexNumber > 0)
            System.out.println("Index is found at: " + indexNumber);
        else
            System.out.println("Index not found");

        System.out.println("Sorted");
        printStringArr(randStringArr);


        //Challenge Three
        int[] randIntArr1 = randomIntsArr(100000);
        int most = (int)(randIntArr1.length * 0.8);
        Team11SortCompetition.quickSort(randIntArr1, 0, most -1);
        System.out.println("\nUnsorted:");
        printArr(randIntArr1);

        int median1 = team11.challengeThree(randIntArr1);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Three Time Taken: " + time  + " Seconds");
        System.out.println("Median equals: " + median1);

        System.out.println("Sorted:");
        printArr(randIntArr1);

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
    public static String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while(num>0)
        {
            int i =0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }
    public static void printArr(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void printStringArr(String[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

}