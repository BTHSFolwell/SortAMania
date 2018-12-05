public class Runner {
    public static void main(String args[]){
        Team4SortCompetition sorter = new Team4SortCompetition();
        int[] randIntArr = sorter.randomIntsArr(10000);
        String [] randStringArr = sorter.randomStringArr(10000, 5);

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

        //Challenge Two
        System.out.println("Unsorted");
        printStringArr(randStringArr);
        time = System.currentTimeMillis();
        sorter.challengeTwo(randStringArr, randStringArr[0]);
        time = System.currentTimeMillis()-time;
        System.out.println("Challenge Two Time Taken: " + (time * 0.001) + " seconds");
        System.out.println("Sorted");
        printStringArr(randStringArr);

    }

    public static int[] printIntArr(int[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.print("\n");
        return null;
    }

    public static String[] printStringArr(String[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.print("\n");
        return null;
    }

}
