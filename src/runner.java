import java.util.Arrays;

public  class runner {
    public  void main(String[] args) {
        long time = System.currentTimeMillis();
        double[] arrDouble = Team15SortCompetition.randDoubleArr(10000);
        System.out.println(Arrays.toString(arrDouble));
        Team15SortCompetition.challengeOne();
        System.out.println(Arrays.toString(arrDouble));
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println(" ");
    }
}