public class Runner {
    public static void main(String args[]){
        Team4SortCompetition sorter = new Team4SortCompetition();

        //Challenge One
        int[] one = sorter.randomIntsArr(10000);
        long time = System.currentTimeMillis();
        sorter.challengeOne(one);
        time = System.currentTimeMillis()-time;
    }
}
