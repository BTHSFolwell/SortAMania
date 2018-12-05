//Kyle and James (Team 16) Period 3 & 4
public class Runner
{
    public static void main(String[] args)
    {
        //Setupk
        SortCompetition team16 = new Team16SortCompetition();
        System.out.println(team16.greeting());
        int[] randIntArr = SortAlgorithm.randomIntsArr(10000);
        int[] randIntArray = SortAlgorithm.randomIntsArr(100000);
        int[][] randIntArrs = SortAlgorithm.randomIntsArrs(1000);
        String[] randStringArr = SortAlgorithm.randomStringArr(10000, 5);
        String randString2 = randStringArr[(int) (Math.random() * randStringArr.length)];
        Object[] randObjectArr = SortAlgorithm.ThingyArr(1000);
        Thingy thingyString = (Thingy) randObjectArr[(int) (Math.random() * randObjectArr.length)];

        //ChallengeOne
        long time = System.currentTimeMillis();
        int median = team16.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        //ChallengeTwo
        long time2 = System.currentTimeMillis();
        int idx2 = team16.challengeTwo(randStringArr, randString2);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds");
        System.out.println("Position of '" + randString2 + "': " + idx2);

        //ChallengeThree
        long time3 = System.currentTimeMillis();
        int median3 = team16.challengeOne(randIntArray);
        time3 = System.currentTimeMillis() - time3;
        System.out.println("Challenge Three Time Taken: " + time3 * 0.001 + " Seconds");
        System.out.println("Median equals: " + median3);

        //ChallengeFour
        long time4 = System.currentTimeMillis();
        int median4 = team16.challengeFour(randIntArrs);
        time4 = System.currentTimeMillis() - time4;
        System.out.println("Challenge Four Time Taken: " + time4 * 0.001 + " Seconds");
        System.out.println("Median equals: " + median4);

        //ChallengeFive
        long time5 = System.currentTimeMillis();
        int idx4 = team16.challengeFive((Comparable[]) randObjectArr, thingyString);
        time5 = System.currentTimeMillis() - time5;
        System.out.println("Challenge Five Time Taken: " + time5 * 0.001 + " Seconds");
        System.out.println("Position of '" + thingyString + "': " + idx4);
    }
}