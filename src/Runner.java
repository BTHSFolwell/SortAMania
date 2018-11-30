public class Runner {

    public static void main(String[] args) {
        SortCompetition team16 = new Team16SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        printIntArr(randIntArr);
        // Challenge 1
        long time = System.currentTimeMillis();
        int median = team16.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        printIntArr(randIntArr);
        // Challenge 2
        printStringArr(randStringArr);
        time = System.currentTimeMillis();
        int index = team16.challengeTwo(randStringArr, "noooo");
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " seconds.");
        System.out.println("The index of noooo is " + index);
        printStringArr(randStringArr);

        // Challenge 4
        int[][] rand2DIntArr = new int[1000][1000];
        for (int i = 0; i < rand2DIntArr.length; i ++) {
            rand2DIntArr[i] = randomIntsArr(1000);
        }
        print2DArr(rand2DIntArr);
        time = System.currentTimeMillis();
        median = team16.challengeFour(rand2DIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Four Time Taken: " + time * 0.001 + " seconds.");
        print2DArr(rand2DIntArr);
    }



    public static int[] randomIntsArr(int num) {
        int[] x = new int[num];
        for (int i = 0; i < num; i ++) {
            x[i] = (int) (Math.random() * 10001);
        }
        return x;
    }
    public static String[] randomStringArr(int num, int length) {
        String[] x = new String[num];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < num; i ++) {
            String y = "";
            for (int j = 0; j < length; j ++) {
                y += alphabet.charAt((int)(Math.random() * 26));
            }
            x[i] = y;
        }
        return x;
    }
    public static void printIntArr(int[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i ++) {
            output += arr[i] + ", ";
        }
        System.out.println(output);
    }
    public static void printStringArr(String[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i ++) {
            output += arr[i] + ", ";
        }
        System.out.println(output);
    }
    public static String print2DArr(int[][] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j ++) {
                output += "(" + i + ", " + j + "): " + arr[i][j];
            }
        }
        return output;
    }
}
