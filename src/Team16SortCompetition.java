public class Team16SortCompetition extends SortCompetition
{
    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }

    public static void swapInt(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void makeInt(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swapInt(arr, i, j);
            }
        }
        swapInt(arr, i + 1, right);
        return (i + 1);
    }

    public static void getMedian(int[] arr)
    {
        if (arr.length % 2 == 0)
        {
            int middle = (arr.length / 2) - 1;
            System.out.println("Median: " + ((arr[middle] + arr[middle + 1]) / 2));
        }
        else
        {
            int middle = (arr.length / 2) - 1;
            System.out.println("Median: " + (arr[middle]));
        }
    }

    @Override
    public int challengeOne(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        if (left < right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
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