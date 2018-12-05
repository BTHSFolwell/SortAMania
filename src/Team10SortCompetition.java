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
}

