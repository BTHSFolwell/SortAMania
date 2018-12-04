
public  class runner {
    public static void main(String[] args) {
       SortCompetition Team15 = new Team15SortCompetition();
       int[] randIntArr = Team15SortCompetition.randomIntsArr(10000);

       System.out.println("Unsorted");
       Team15SortCompetition.printArr(randIntArr);

       long time = System.currentTimeMillis();
       int median = Team15.challengeOne(randIntArr);
       time = System.currentTimeMillis() - time;
       System.out.println("Challenge One Time Taken : " + time * 0.001 + " Seconds");
       System.out.println("Median equals: " + median);

       System.out.println("Sorted");
       Team15SortCompetition.printArr(randIntArr);
       System.out.println("--------------------------------");
       String[] randStringArr = Team15SortCompetition.randomStringArr(10000,5);
       System.out.println("Unsorted");
       Team15SortCompetition.printArrStr(randStringArr);
       long time1 = System.currentTimeMillis();
       int index = Team15.challengeTwo(randStringArr,"asdas");
       time1 = System.currentTimeMillis() - time1;
       System.out.println("Challenge Two Time Taken : " + time1 * 0.001 + " Seconds");
       System.out.println("Index equals: " + index);

       System.out.println("Sorted");
       Team15SortCompetition.printArrStr(randStringArr);
       System.out.println("--------------------------------");
       int[] randIntArr1 = Team15SortCompetition.randomIntsArr(10000);

       System.out.println("Unsorted");
       Team15SortCompetition.printArr(randIntArr1);

       long time2 = System.currentTimeMillis();
       int median2 = Team15.challengeOne(randIntArr1);
       time2 = System.currentTimeMillis() - time2;
       System.out.println("Challenge One Time Taken : " + time2 * 0.001 + " Seconds");
       System.out.println("Median equals: " + median2);

       System.out.println("Sorted");
       Team15SortCompetition.printArr(randIntArr1);
       System.out.println("--------------------------------");

       int[][] rand2DIntArr = new int[1000][1000];
       for (int i = 0; i < rand2DIntArr.length; i ++) {
          rand2DIntArr[i] = Team15SortCompetition.randomIntsArr(1000);
       }
       long time3 = System.currentTimeMillis();
       int median3 = Team15.challengeFour(rand2DIntArr);
       time3 = System.currentTimeMillis() - time;
       System.out.println("Challenge Four Time Taken: " + time3 * 0.001 + " seconds.");
       System.out.println("The median is " + median3);
       Team15.addTime(time);

    }
}