public class Runner
{
    public static void main(String[] args)
    {
        SortCompetition team16 = new Team16SortCompetition();
        int[] randIntArr = SortAlgorithm.randomIntsArr(10000);
        int[][] randIntArrs = SortAlgorithm.randomIntsArrs(5);
        String[] randStringArr = SortAlgorithm.randomStringArr(10000, 5);

        //ChallengeOne
        long time = System.currentTimeMillis();
        int median = team16.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        //ChallengeTwo
        long time2 = System.currentTimeMillis();
        String randString2 = SortAlgorithm.randomString(5);
        int idx2 = team16.challengeTwo(randStringArr, randString2);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds");
        System.out.println("Position of '" + randString2 + "' : " + idx2);

        //ChallengeThree
        long time3 = System.currentTimeMillis();
        int median3 = team16.challengeOne(randIntArr);
        time3 = System.currentTimeMillis() - time3;
        System.out.println("Challenge Three Time Taken: " + time3 * 0.001 + " Seconds");
        System.out.println("Median equals: " + median3);

        //ChallengeFour
        long time4 = System.currentTimeMillis();
        int median4 = team16.challengeFour(randIntArrs);
        time4 = System.currentTimeMillis() - time4;
        System.out.println("Challenge Four Time Taken: " + time4 * 0.001 + " Seconds");
        System.out.println("Median equals: " + median4);
    }
}