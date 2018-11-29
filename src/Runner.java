public class Runner
{
    public static void main(String[] args)
    {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 10000);
        }
        Team16SortCompetition.challengeOne(arr);
    }
}