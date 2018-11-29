public class Team16SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getMedian(arr));
    }

    public int challengeTwo(String[] arr, String query)
    {
        return (SortAlgorithm.getIdx(arr, query));
    }


    public int challengeThree(int[] arr)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getMedian(arr));
    }

    public int challengeFour(int[][] arr) {
        return 0;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    public String greeting() {
        return null;
    }
}