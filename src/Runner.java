public class Runner {
    public static void main(String args[]){
        Team4SortCompetition sorter = new Team4SortCompetition();
        int[] randIntArr = sorter.randomIntsArr(10000);
        String [] randStringArr = sorter.randomStringArr(10000, 5);
        int [] randIntArrThree = sorter.randomIntsArr(100000);

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

        //Challenge Three
        System.out.println("Unsorted");
        printIntArr(randIntArrThree);
        time = System.currentTimeMillis();
        sorter.challengeThree(randIntArrThree);
        time = System.currentTimeMillis()-time;
        System.out.println("Challenge Three Time Taken: " + (time * 0.001) + " seconds");
        System.out.println("Sorted");
        printIntArr(randIntArrThree);
        System.out.println("The median is: " + randIntArrThree[49999]);

        //Challenge Four
        int[][] four = randomTwoDIntArr(1000);
        //printTwoDArr(four);
        System.out.println("Unsorted");
        time = System.currentTimeMillis();
        System.out.println("Median: " + sorter.challengeFour(four));
        time = System.currentTimeMillis() - time;
        System.out.println("Sorted");
        System.out.println("Challenge Four Time Taken: "+ time / 1000 + " seconds");
    }

    public static int[] printIntArr(int[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.print("\n");
        return null;
    }

    public static int[][] randomTwoDIntArr(int num) {
        int[][] arr = new int[num][num];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10001);
            }
        }
        return arr;
    }

    public static String[] printStringArr(String[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.print("\n");
        return null;
    }

}
