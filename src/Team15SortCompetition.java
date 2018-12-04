public class Team15SortCompetition extends SortCompetition{
    public static void swapInt(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private int part(int[] arr, int x, int y) {
        int z = arr[y];
        int i = x - 1;

        for (int j = x; j < y; j ++) {
            if (arr[j] <= z) {
                i ++;
                int k = arr[i]; arr[i] = arr[j]; arr[j] = k;
            }
        }
        int l = arr[i + 1]; arr[i + 1] = arr[y]; arr[y] = l;
        return i + 1;
    }

    private void quickSort(int[] arr, int x, int y) {
        if (x < y) {
            int z = part(arr, x, y);
            quickSort(arr, x, z - 1);
            quickSort(arr, z + 1, y);
        }
    }

    public static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
    public static int[] randomIntsArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }
    static void printArr(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void printArrStr(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    @Override
    public int challengeOne(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swapInt(arr, i, min);
            }
        }
        return arr[arr.length/2];
    }
    @Override
    public int challengeTwo(String[] arr, String query) {
        int ch = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swapString(arr, j, j + 1);
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            if (arr[a].equals(query)) {
                 ch = a;
            } else {
                 ch = -1;
            }
        }
        return ch;
    }

    @Override
    public int challengeThree(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swapInt(arr, i, min);
            }
        }
        return arr[arr.length/2];
    }

    @Override
    public int challengeFour(int[][] arr) {
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            quickSort(arr[i], 0, arr[i].length - 1);
            medians[i] = arr[i][arr[i].length/2 - 1];
        }
        quickSort(medians, 0, medians.length - 1);
        return medians[medians.length/2 - 1];
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }

}
