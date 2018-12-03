import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

    Team14SortCompetition team14 = new Team14SortCompetition();


    int[] randIntArr = Sorts.buildArray(10000);
    String[] randomStringArr = Sorts.randomStringArr(10000,5);


        System.out.println("Unsorted");
      System.out.println(Arrays.toString(randIntArr));

    long time = System.currentTimeMillis();
    int median = team14.challengeOne(randIntArr);
    time = System.currentTimeMillis() - time;
    System.out.println("Challenge one Time Taken: " + time * .001 +"Seconds");
    System.out.println("Median equals" + median);

    System.out.println("sorted");

       System.out.println(Arrays.toString(randIntArr));

        System.out.println(Arrays.toString(randomStringArr));
        int found = team14.challengeTwo(randomStringArr,"bitch");
        System.out.println(found);

    }
    }



