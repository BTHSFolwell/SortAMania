public class Team15SortCompetition{
    public static void swapInt(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int challengeOne(int[] arr)
    {
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
    }
    public static double[] randDoubleArr(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) ((Math.random() * 10000.0)+1);
        }
        return arr;
    }
}
