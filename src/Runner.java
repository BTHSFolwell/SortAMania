public class Runner {
    public static void main(String args[]){
        Team4SortCompetition sorter = new Team4SortCompetition();
        int[] randIntArr = sorter.randomIntsArr(10000);

        //Challenge One
        System.out.println("Unsorted");
        printIntArr(randIntArr);

        long time = System.currentTimeMillis();
        sorter.challengeOne(randIntArr);
        time = System.currentTimeMillis()-time;
        System.out.println("Challenge One Time Taken: " + (time * 0.001) + " seconds");

        System.out.println("Sorted");
        printIntArr(randIntArr);
        System.out.println("The median is: " + randIntArr[4999]);
    }

    public static int[] printIntArr(int[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.print("\n");
        return null;
    }
}
