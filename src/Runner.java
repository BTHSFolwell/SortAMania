import javax.rmi.CORBA.Util;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        SortCompetition sortComp = new Team6SortCompetition();
        int[] challenge1Arr = Utilities.genIntArr(10000);
        int[] challenge3Arr = Utilities.mostlySortedArr(75000,25000);
        int[][] challenge4Arr = Utilities.gen2dInt(10, 10);
        //Thingy[] challenge5Arr = Utilities.genComparableArr(10000);

        //Challenge 1
        //System.out.println(Arrays.toString(challenge1Arr));
        long startTime = System.currentTimeMillis();
        System.out.println("Challenge 1 Median: " + sortComp.challengeOne(challenge1Arr));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        //System.out.println(Arrays.toString(challenge1Arr));
        /*System.out.println("Challenge 1 time: " + duration + "ms.\n");
        //Challenge 3
        //System.out.println(Arrays.toString(challenge3Arr));
        startTime = System.currentTimeMillis();
        System.out.println("Challenge 3 Median: " + sortComp.challengeThree(challenge3Arr));
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        //System.out.println(Arrays.toString(challenge3Arr));
        System.out.println("Challenge 3 time: " + duration + "ms.\n");*/
        //Challenge 4
        System.out.println(Arrays.deepToString(challenge4Arr));
        startTime = System.currentTimeMillis();
        System.out.println("Challenge 4 Median: " + sortComp.challengeFour(challenge4Arr));
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Challenge 4 time: " + duration + "ms.\n");
        System.out.println(Arrays.deepToString(challenge4Arr));
        Thingy[] thingyArr = new Thingy[10000];
        for (int i = 0; i < 10000; i++) {
            thingyArr[i] = new Thingy();
        }
        Thingy query = thingyArr[(int)Math.random()*thingyArr.length];
        long startTime5 = System.currentTimeMillis();
        System.out.println("Challenge 5: " + sortComp.challengeFive(thingyArr, query));
        long endTime5 = System.currentTimeMillis();
        long duration5 = (endTime5 - startTime5);
        System.out.println("Challenge 5 time: " + duration5 + "ms.\n");
    }
}