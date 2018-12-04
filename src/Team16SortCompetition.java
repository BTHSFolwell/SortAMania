public class Team16SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getMedian(arr));
    }

    public int challengeTwo(String[] arr, String query)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getIdx(arr, query));
    }


    public int challengeThree(int[] arr)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getMedian(arr));
    }

    public int challengeFour(int[][] arr)
    {
        int[] medianArr = new int[arr[0]. length];
        for (int i = 0; i < arr[0]. length; i++)
        {
            SortAlgorithm.quickSort(arr[i], 0, arr.length - 1);
            medianArr[i] = (SortAlgorithm.getMedian(arr[i]));
        }
        SortAlgorithm.quickSort(medianArr, 0, arr.length - 1);
        return (SortAlgorithm.getMedian(medianArr));
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        SortAlgorithm.quickSort((Thingy[]) arr, 0, arr.length - 1);
        return (SortAlgorithm.getIdx(arr, query));
    }

    public String greeting()
    {
        return "Welcome to Team16's Sort-A-Mania!";
    }

}