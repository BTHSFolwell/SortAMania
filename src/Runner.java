import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        SortCompetition sortComp = new Team6SortCompetition();
        int[] challenge1Arr = Utilities.genIntArr(10000);
        //Challenge 1
        System.out.println(Arrays.toString(challenge1Arr));
        long startTime = System.currentTimeMillis();
        System.out.println(sortComp.challengeOne(challenge1Arr));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(Arrays.toString(challenge1Arr));
        System.out.println("Insertion sort time took: " + duration + "ms.\n");
        //Challenge 2
    }
}