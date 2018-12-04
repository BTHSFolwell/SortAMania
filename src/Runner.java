import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

    Team14SortCompetition team14 = new Team14SortCompetition();


    int[] randIntArr = Sorts.buildArray(10);
    int[] randIntArr3 = Sorts.buildArray(10);
    String[] randomStringArr = Sorts.randomStringArr(10,10);
    int[][] randIntArr4 = Sorts.Arr2d(10,10);
    Comparable[]  randComparable = Sorts.randomThingArr(10);


        System.out.println("Unsorted");
        System.out.println(Arrays.toString(randIntArr));
        System.out.println(Arrays.toString(randomStringArr));
        System.out.println(Arrays.toString(randIntArr3));
        Sorts.arrPrint2d(randIntArr4);

        System.out.println();
        long time = System.currentTimeMillis();
        int median = team14.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge one Time Taken: " + time * .001 +"Seconds");
        System.out.println("Median equals " + median);
        System.out.println("sorted");
        System.out.println(Arrays.toString(randIntArr));
        System.out.println();



         time = System.currentTimeMillis();
         int found = team14.challengeTwo(randomStringArr,"wowza");
         time = System.currentTimeMillis() - time;
         System.out.println("Challenge two Time Taken: " + time * .001 +"Seconds");
            if (found == 0)
                System.out.println("We found the word.");
            else
            System.out.println("We couldn't find the word");
        System.out.println("sorted");
        System.out.println(Arrays.toString(randomStringArr));
        System.out.println();


        time = System.currentTimeMillis();
        int median3 = team14.challengeThree(randIntArr3);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge three Time Taken: " + time * .001 +"Seconds");
        System.out.println("Median equals "+median3);
        System.out.println("sorted");
        System.out.println(Arrays.toString(randIntArr3));
        System.out.println();


        time = System.currentTimeMillis();
        int median4 = team14.challengeFour(randIntArr4);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge four Time Taken: " + time * .001 +"Seconds");
        System.out.println("Median equals "+median4);
        System.out.println("sorted");
        //System.out.println(Arrays.toString(randIntArr3));
        System.out.println();

    }
    }



