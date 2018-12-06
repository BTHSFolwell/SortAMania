import java.sql.SQLOutput;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args){

        SortCompetition team11 = new Team11SortCompetition();

        //Challenge One
        System.out.println("Challenge One\n------------------------------------------");
        int[] randIntArr = randomIntsArr(10000);

        System.out.println("Unsorted:");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team11.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("\nChallenge One Time Taken: " + time  + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("\nSorted:");
        printArr(randIntArr);
        System.out.println("");

        //Challenge Two
        System.out.println("Challenge Two\n------------------------------------------");
        String[] randStringArr = randomStringArr(10000,5);

        System.out.println("Unsorted:");
        printStringArr(randStringArr);
        int indexNumber = team11.challengeTwo(randStringArr,"Hello");

        time = System.currentTimeMillis();
        time = System.currentTimeMillis() - time;
        System.out.println("\nChallenge Two Time Taken: " + time  + " Seconds");
        if(indexNumber > 0)
            System.out.println("Index is found at: " + indexNumber);
        else
            System.out.println("Index not found");

        System.out.println("\nSorted:");
        printStringArr(randStringArr);
        System.out.println("");


        //Challenge Three
        System.out.println("Challenge Three\n------------------------------------------");
        int[] randIntArr1 = randomIntsArr(100000);
        int most = (int)(randIntArr1.length * 0.8);
        Team11SortCompetition.quickSort(randIntArr1, 0, most -1);
        System.out.println("Unsorted:");
        printArr(randIntArr1);

        int median1 = team11.challengeThree(randIntArr1);
        time = System.currentTimeMillis();
        time = System.currentTimeMillis() - time;
        System.out.println("\nChallenge Three Time Taken: " + time  + " Seconds");
        System.out.println("Median equals: " + median1);

        System.out.println("\nSorted:");
        printArr(randIntArr1);
        System.out.println("");

        //Challenge Four
        System.out.println("Challenge Four\n------------------------------------------");
        int[][] randMultArr = randMultiArr(1000);
        System.out.println("Unsorted:");
        printMultiArr(randMultArr);
        int median2 = team11.challengeFour(randMultArr);

        time = System.currentTimeMillis();
        time = System.currentTimeMillis() - time;
        System.out.println("\nChallenge Four Time Taken: " + time  + " Seconds");
        System.out.println("Median equals: " + median2);

        System.out.println("\nSorted:");
        printMultiArr(randMultArr);
        System.out.println("");

        //Challenge Five
        System.out.println("Challenge Five\n------------------------------------------");
        Thingy[] randComparableArr = randComparableArr(10000);
        Thingy thingy = new Thingy();
        System.out.println("Unsorted");
        printComparableArr(randComparableArr);

        time = System.currentTimeMillis();
        int index = team11.challengeFive(randComparableArr, thingy);
        time = System.currentTimeMillis() - time;
        System.out.println("\nChallenge Five Time Taken: " + (time * 0.001) + " Seconds");
        System.out.println("Thingy appears at: " + index);

        System.out.println("\nSorted");
        printComparableArr(randComparableArr);
    }

    public static int[] randomIntsArr(int count) {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }
    public static int [][] randMultiArr(int count){
        int[][] arr =  new int [count][count];
        for(int i=0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j] = (int) (Math.random()*100);
            }
        }
        return arr;
    }
    public static String[] randomStringArr(int num, int length) {
        String [] arr = new String [num];
        while(num>0) {
            int i =0;
            String s = "";
            while(i<length) {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }
    public static Thingy[] randComparableArr(int num){
        Thingy[] things = new Thingy[num];
        for(int i = 0; i < num; i ++){
            things[i] = new Thingy();
        }
        return things;
    }
    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void printStringArr(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void printMultiArr(int[][] arr)
    {
        System.out.println(Arrays.deepToString(arr));
    }
    public static void printComparableArr(Thingy[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}
