public class Runner {
    public static void main(String[] args) {
        System.out.println("Challenge 1");
        Team2SortCompetition team2 = new Team2SortCompetition();
        int[] one = randomIntArr(10000);
        printIntArr(one);
        System.out.println("Unsorted");
        long timer = System.nanoTime();
        System.out.println("Median: " + team2.challengeOne(one));
        timer = System.nanoTime() - timer;
        System.out.println("Sorted");
        System.out.println(timer / 1000000000 + " seconds");
        printIntArr(one);

        System.out.println();
        System.out.println("Challenge 2");
        String[] two = randomStringArr(10000, 5);
        printStringArr(two);
        timer = System.nanoTime();
        System.out.println("Unsorted");
        System.out.println(team2.challengeTwo(two, "abcde"));
        timer = System.nanoTime() - timer;
        System.out.println("Sorted");
        System.out.println(timer / 1000000000 + " seconds");
        printStringArr(two);

        System.out.println();
        System.out.println("Challenge 3");
        int[] three = new int[10];
        three[0] = (int) (Math.random() * 10) + 1;
        for (int i = 1; i < three.length; i++)
        {
            three[i] = three[i - 1] + (int) (Math.random() * 12) - 2;
        }
        printIntArr(three);
        System.out.println("Unsorted");
        timer = System.nanoTime();
        System.out.println("Median: " + team2.challengeThree(three));
        timer = System.nanoTime() - timer;
        System.out.println("Sorted");
        System.out.println(timer / 1000000000 + " seconds");
        printIntArr(three);

        System.out.println();
        System.out.println("Challenge 4");
        int[][] four = randomTwoDIntArr(5);
        printTwoDArr(four);
        System.out.println("Unsorted");
        timer = System.nanoTime();
        System.out.println("Median: " + team2.challengeFour(four));
        timer = System.nanoTime() - timer;
        System.out.println("Sorted");
        System.out.println(timer / 1000000000 + " seconds");
        printTwoDArr(four);

        System.out.println();
        System.out.println("Challenge 5");
        Comparable[] arr = new Comparable[1000];
        for (int i = 0; i < arr.length; i ++) {
            Team2SortCompetition thingy1 = new Team2SortCompetition();
            thingy1.addTime(1000);
            arr[i] = thingy1;
        }
        Team2SortCompetition thingy2 = new Team2SortCompetition();
        Comparable query = thingy2;
        team2.challengeFive(arr, query);
    }

    public static int[] randomIntArr(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int rand = (int) ((Math.random() * 1000));
            arr[i] = rand;
        }
        return arr;
    }

    public static void printIntArr(int[] arr) {
        String string = "";
        for (int i = 0; i < arr.length; i++) {
            string = string + arr[i] + " ";
        }
        System.out.println(string);
    }

    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < num; i ++) {
            String str = "";
            for (int j = 0; j < length; j ++) {
                str += alphabet.charAt((int)(Math.random() * 26));
            }
            arr[i] = str;
        }
        return arr;
    }

    public static void printStringArr(String[] arr) {
        String string = "";
        for (int i = 0; i < arr.length; i++) {
            string = string + arr[i] + " ";
        }
        System.out.println(string);
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

    public static void printTwoDArr(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            String string = "";
            for (int j = 0; j < arr[i].length; j++)
            {
                string = string + arr[i][j] + " ";
            }
            System.out.println(string);
        }

    }
}
