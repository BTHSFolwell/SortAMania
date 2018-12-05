public class Team16SortCompetition extends SortCompetition
{
    //Sort the list and return the median
    public int challengeOne(int[] arr)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getMedian(arr));
    }

    //Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found
    public int challengeTwo(String[] arr, String query)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getIdx(arr, query));
    }

    //Sort the list and return the median
    public int challengeThree(int[] arr)
    {
        SortAlgorithm.quickSort(arr, 0, arr.length - 1);
        return (SortAlgorithm.getMedian(arr));
    }

    //Sort each sub-array and then sort the arrays by their median value, return the median of the median array
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

    //Sort the array by the compareTo method, and determine if it contains the element given, return the position of the object, or -1 if not found
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        SortAlgorithm.quickSort((Thingy[]) arr, 0, arr.length - 1);
        return (SortAlgorithm.getIdx(arr, query));
    }

    //Greeting (Start of the project)
    public String greeting()
    {
        return "Welcome to Team16's Sort-A-Mania!";
    }

}