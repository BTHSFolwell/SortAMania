public class Team2SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        return 0;
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

    public static void quickSort(int[] list1, int left, int right)
    {
        if (left < right)
        {
            int pivot = Partition(list1, left, right);

            quickSort(list1, left, pivot -1);
            quickSort(list1, pivot+1, right);
        }

    }

    public static int Partition(int[] list1, int left, int right)
    {
        int pivot = list1[right];
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (list1[j] <= pivot) {
                i++;
                int temp = list1[i];
                list1[i] = list1[j];
                list1[j] = temp;
            }
        }
        int temp = list1[i + 1];
        list1[i + 1] = list1[right];
        list1[right] = temp;
        return i + 1;
    }
}
