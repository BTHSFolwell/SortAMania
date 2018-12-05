public class SortAlgorithm
{
    //Creates a random number array(1D)
    public static int[] randomIntsArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*count);
        }
        return arr;
    }

    //Creates a random number array(2D)
    public static int[][] randomIntsArrs(int count)
    {
        int[][] arr = new int[count][count];
        for (int i = 0; i < count; i++)
        {
            for (int j = 0; j < count; j++)
            {
                arr[i][j] = (int) (Math.random() * count);
            }
        }
        return arr;
    }

    //Creates a random string array(1D)
    public static String[] randomStringArr(int count, int length)
    {
        String[] arr = new String[count];
        while (count > 0)
        {
            int i = 0;
            String str = "";
            while (i < length)
            {
                char c = (char) ((Math.random()*26)+97);
                str = str + c;
                i++;
            }
            count--;
            arr[count] = str;
        }
        return arr;
    }

    //Creates a random object array
    public static Object[] ThingyArr(int length)
    {
        Thingy[] randThingyArr = new Thingy[length];
        for (int i = 0; i < length; i++)
        {
            randThingyArr[i] = new Thingy();
        }
        return randThingyArr;
    }

    //Swaps two strings
    public static void swap(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Swaps two numbers
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Swaps two objects
    public static void swap(Thingy[] arr, int i, int j)
    {
        Thingy temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Sort method for numbers
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
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return (i + 1);
    }

    //Sort method for strings
    public static void quickSort(String[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    public static int partition(String[] arr, int left, int right)
    {
        String pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (arr[j].compareTo(pivot) <= 0)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return (i + 1);
    }

    //Sort method for objects
    public static void quickSort(Thingy[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    public static int partition(Thingy[] arr, int left, int right)
    {
        Thingy pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++)
        {
            if (arr[j].compareTo(pivot) <= 0)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return (i + 1);
    }

    //Returns the median of a number array
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

    //Returns the index of a string in a string array
    public static int getIdx(Comparable[] arr, Comparable query)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i].equals(query))
                return i;
        }
        return -1;
    }
}
