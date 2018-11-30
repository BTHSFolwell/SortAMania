public class Runner
{
    public static void main(String[] args)
    {
        SortCompetition team16 = new Team16SortCompetition();
        int[] randIntArr = SortAlgorithm.randomIntsArr(10000);
        String[] randStringArr = SortAlgorithm.randomStringArr(10000, 5);

        System.out.println("Unsorted");
        SortAlgorithm.printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team16.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        SortAlgorithm.printArr(randIntArr);

        System.out.println("Unsorted");
        SortAlgorithm.printArr(randStringArr);

        long time2 = System.currentTimeMillis();
        String randString = SortAlgorithm.randomString(5);
        int idx = team16.challengeTwo(randStringArr, randString);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds");
        System.out.println("Position of '" + randString + "' : " + idx);
    }
}