public class SortAlgorithm
{
    public static void swapString(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapDouble(double[] arr, int i, int j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapInt(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

    public static int getMedian(int[] arr)
    {
        if (arr.length % 2 == 0)
        {
            int middle = (arr.length / 2) - 1;
            return ((arr[middle] + arr[middle + 1]) / 2);
        }
        else
        {
            int middle = (arr.length / 2) - 1;
            return (arr[middle]);
        }
    }

    public static int getIdx(String[] arr, String query)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i].equals(query))
                return i;
        }
        return -1;
    }
}
