public class Team8SortCompetitionRunner {
    public static void main(String[] args) {
        SortCompetition team8 = new Team8SortCompetition();
        int[] randIntArr = SortingAlgorithms.getRandIntArr(10000);
        String[] randStringArr = SortingAlgorithms.getRandStringArr(10000, 0, 5);
        String query = randStringArr[(int) (Math.random() * randStringArr.length)];
        int[] mostlySortedIntArr = SortingAlgorithms.getRandIntArr(10000, .80);

        System.out.println("Unsorted");
        SortingAlgorithms.printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team8.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        SortingAlgorithms.printArr(randIntArr);

        System.out.println("\nUnsorted");
        SortingAlgorithms.printArr(randStringArr);

        time = System.currentTimeMillis();
        int index = team8.challengeTwo(randStringArr, query);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Index of \"" + query + "\" equals: " + index);

        System.out.println("Sorted");
        SortingAlgorithms.printArr(randStringArr);

        System.out.println("\nUnsorted");
        SortingAlgorithms.printArr(mostlySortedIntArr);

        time = System.currentTimeMillis();
        median = team8.challengeThree(mostlySortedIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        SortingAlgorithms.printArr(mostlySortedIntArr);
    }
}
