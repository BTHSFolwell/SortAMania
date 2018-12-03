
public  class Runner {
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



       String[] randStringArr = Team15SortCompetition.randomStringArr(10000,5);

       System.out.println("Unsorted");
       Team15SortCompetition.printArr(randIntArr);

       time = System.currentTimeMillis() - time;
       System.out.println("Challenge Two Time Taken : " + time * 0.001 + " Seconds");
       System.out.println("Median equals: " + median);

       System.out.println("Sorted");
       Team15SortCompetition.printArr(randStringArr);


    }
}