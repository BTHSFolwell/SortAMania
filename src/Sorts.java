import java.util.Arrays;

public class Sorts
{
    //Creates a random array of integers with a specified size.
    public static int[] buildArray(int size)
    {
        int[] arr = new int[size];
        for(int i = 0; i < size; i ++)
        {
            arr[i] = (int)(Math.random() * 10000);
        }

        return arr;
    }

    //Creates a random array of integers with one place swapped. Effectively 99% sorted
    public static int[] buildArray3(int size)
    {
        int[] arr = new int[size];
        for(int i = 0; i < size; i ++)
        {
            arr[i] = (int)(Math.random() * 10000);
        }

        quickSort(arr,0,arr.length-1);

        int swap = (int)(Math.random() * arr.length);
        int swap2 = (int)(Math.random() * arr.length);

        while (swap == swap2)
        {
             swap = (int)(Math.random() * arr.length);
             swap2 = (int)(Math.random() * arr.length);
        }


        swap(arr,swap,swap2);



        return arr;
    }

    //swaps place in an array
    public static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;

        for (int j = left; j <right;j++)
        {
            if (arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }


    public static void quickSort(int[] arr, int left, int right)
    {
        if (left < right)
        {

            int pivot = partition(arr, left, right);

            quickSort(arr,left, pivot -1);
            quickSort(arr, pivot + 1, right);

        }
    }



    public static void bubbleSort(String[] list3) {
        for (int i = 0; i < list3.length; i++) {
            for (int j = i + 1; j < list3.length; j++) {
                if (list3[i].compareTo(list3[j]) > 0) {
                    swapString(list3,i,j);
                }
            }
        }
    }

    //Bubble sort that works for comparable[]
    public static void bubbleSortThing(Comparable[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i + 1; j < comparables.length; j++) {
                if (comparables[i].compareTo(comparables[j]) > 0) {
                    swapComparables(comparables,i,j);
                }
            }
        }
    }






    public static int randomNumber(int min, int max)
    {
        return (int)((max - min + 1) * Math.random() + min);
    }

    //Swaps the location of two strings in an array
    public static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Swaps the locations of two Comparables
    public static void swapComparables(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Creates a random array of strings
    public static String [] randomStringArr(int num, int length)
    {
        String [] arr = new String[num];
        while (num>0)
        {
            int i =0;
            String s = "";
            while (i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }





//Creates a random 2d array
    public static int[][] Arr2d(int width, int height) {
        int[][] arr = new int[height][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10000);
            }

        }
        return arr;
    }
//Creates a random array of things
    public static Thing[] randomThingArr(int num)
    {
        Thing[] things = new Thing[num];
        for (int i=0;i<num;i++)
        {
            things[i] = new Thing();
        }
        return things;
    }






}
