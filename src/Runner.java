public class Runner
{
    public static void main(String[] args)
    {
        SortCompetition team16 = new Team16SortCompetition();
        int[] randIntArr = SortAlgorithm.randomIntsArr(10000);
        String[] randStringArr = SortAlgorithm.randomStringArr(10000, 5);

        //ChallengeOne
        System.out.println("Unsorted");
        SortAlgorithm.printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team16.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        SortAlgorithm.printArr(randIntArr);

        //ChallengeTwo
        System.out.println("Unsorted");
        SortAlgorithm.printArr(randStringArr);

        long time2 = System.currentTimeMillis();
        String randString2 = SortAlgorithm.randomString(5);
        int idx2 = team16.challengeTwo(randStringArr, randString2);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds");
        System.out.println("Position of '" + randString2 + "' : " + idx2);

        System.out.println("Sorted");
        SortAlgorithm.printArr(randStringArr);

        //ChallengeThree
        System.out.println("Unsorted");
        SortAlgorithm.printArr(randIntArr);

        long time3 = System.currentTimeMillis();
        int median3 = team16.challengeOne(randIntArr);
        time3 = System.currentTimeMillis() - time3;
        System.out.println("Challenge One Time Taken: " + time3 * 0.001 + " Seconds");
        System.out.println("Median equals: " + median3);

        System.out.println("Sorted");
        SortAlgorithm.printArr(randIntArr);
    }
}