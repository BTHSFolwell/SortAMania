import java.util.Arrays;
import java.util.List;

public class Team10SortCompetition {

    public int challengeOne(int[] challenge1)
    {
        double median;
        for(int i=0;i<challenge1.length;i++)
        {
            int min = challenge1[i];
            int x = i - 1;
            while(x>=0 && challenge1[x] > min)
            {
                challenge1[x+1] = challenge1[x];
                x--;
            }
            challenge1[x+1] = min;
        }
        if(challenge1.length % 2 == 0)
        {
            median = ((double)challenge1[(challenge1.length/2)] + (double)challenge1[(challenge1.length/2) - 1])/2;
        }
        else
        {
            median = (double)challenge1[challenge1.length/2];
        }
        return (int)median;
    }


    public int challengeTwo(String[] challenge2, String str)
    {
        mergeSort(challenge2);
        if(Arrays.asList(challenge2).contains(str))
        {
            List<String> challenger2 = Arrays.asList(challenge2);
            return (challenger2.indexOf(str));
        }
        else
        {
            return (-1);
        }
    }

    public static void mergeSort(String[] challenge2)
    {
        int n = challenge2.length;
        String[] temp = new String[n];
        mergeSortHelper(challenge2, 0, n-1, temp);
    }

    public static void mergeSortHelper(String[] challenge2, int left, int right, String[] temp)
    {
        if (left<right)
        {
            int mid = (left+right)/2;
            mergeSortHelper(challenge2, left, mid, temp);
            mergeSortHelper(challenge2, mid+1, right, temp);
            merge(challenge2, left, mid, right, temp);
        }
    }

    private static void merge(String[] challenge2, int left, int mid, int right, String[] temp)
    {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right)
        {
            if (challenge2[i] == challenge2[j])
            {
                temp[k] = challenge2[i];
                i++;
            }
            else
            {
                temp[k] = challenge2[j];
                j++;
            }
            k++;
        }
    }

    public int challengeThree(int[] challenge3)
    {
        double median;
        int n = challenge3.length;
        for (int i=1; i<n; ++i)
        {
            int key = challenge3[i];
            int j = i-1;
            while (j>=0 && challenge3[j] > key)
            {
                challenge3[j+1] = challenge3[j];
                j = j-1;
            }
            challenge3[j+1] = key;
        }
        if(challenge3.length % 2 == 0)
        {
            median = ((double)challenge3[(challenge3.length/2)] + (double)challenge3[(challenge3.length/2) - 1])/2;
            median = Math.floor(median);
        }
        else
        {
            median = (double)challenge3[challenge3.length/2];
        }
        return (int)median;
    }

    private void quickSort(int[] arr, int x, int y) {
        if (x < y) {
            int z = part(arr, x, y);
            quickSort(arr, x, z - 1);
            quickSort(arr, z + 1, y);
        }
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

    public int challengeFour(int[][] arr) {
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            quickSort(arr[i], 0, arr[i].length - 1);
            medians[i] = arr[i][arr[i].length/2 - 1];
        }
        quickSort(medians, 0, medians.length - 1);
        return medians[medians.length/2 - 1];
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        quickSortComp(arr, 0, arr.length - 1);
        boolean x = false; int lwr = 0; int upr = arr.length - 1; int mid = arr.length/2 - 1;
        while (!x) {
            if (query.compareTo(arr[mid]) > 0) {
                lwr = mid; mid = ((upr - lwr) / 2) + lwr;
            }
            else if (query.compareTo(arr[mid]) < 0) {
                upr = mid; mid = ((upr - lwr) / 2) + lwr;
            }
            else return mid;
            if (upr <= lwr || lwr == mid || upr == mid) {
                x = true;
            }
        }
        return -1;
    }

    private void quickSortComp(Comparable[] arr, int x, int y) {
        if (x < y) {
            int z = partComp(arr, x, y);
            quickSortComp(arr, x, z - 1);
            quickSortComp(arr, z + 1, y);
        }
    }
    private int partComp(Comparable[] arr, int x, int y) {
        Comparable z = arr[y];
        int i = x - 1;

        for (int j = x; j < y; j ++) {
            if (arr[j].compareTo(z) <= 0) {
                i ++;
                Comparable k = arr[i]; arr[i] = arr[j]; arr[j] = k;
            }
        }
        Comparable l = arr[i + 1]; arr[i + 1] = arr[y]; arr[y] = l;
        return i + 1;
    }
}

