
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
       int median2 = Team15.challengeThree(randIntArr1);
       time2 = System.currentTimeMillis() - time2;
       System.out.println("Challenge Three Time Taken : " + time2 * 0.001 + " Seconds");
       System.out.println("Median equals: " + median2);

       System.out.println("Sorted");
       Team15SortCompetition.printArr(randIntArr1);
       System.out.println("--------------------------------");

    }
}