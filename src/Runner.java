public class Runner {

    public static void main(String[] args) {
        SortCompetition team16 = new Team16SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printIntArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team16.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printIntArr(randIntArr);

        time = System.currentTimeMillis();
        int index = team16.challengeTwo(randStringArr, "noooo");
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " seconds.");
        System.out.println("The index of noooo is " + index);
        System.out.println("Sorted");
        printStringArr(randStringArr);

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
                y += alphabet.charAt((int)(Math.random() * 25));
            }
            x[i] = y;
        }
        return x;
    }
    public static void printIntArr(int[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i ++) {
            output += arr[i];
        }
        System.out.println(output);
    }
    public static void printStringArr(String[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i ++) {
            output += arr[i];
        }
        System.out.println(output);
    }
}
