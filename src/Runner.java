public class Runner {
    public static void main(String[] args)
    {
        int[] randIntArr = randomIntArr(100);
        String stringArr = "";
        for (int i = 0; i < randIntArr.length; i++)
        {
            stringArr = stringArr + randIntArr[i] + " ";
        }
        System.out.println("Random Integer Array: " + stringArr);
        long time = System.nanoTime();
        Team2SortCompetition sortcomp = new Team2SortCompetition();
        time = System.nanoTime() - time;
        System.out.println(sortcomp.challengeOne(randIntArr));
    }

    public static int[] randomIntArr(int num)
    {
        int [] arr = new int [num];
        for (int i = 0; i < num; i++)
        {
            int rand = (int)((Math.random() * 1000) );
            arr[i] = rand;
        }
        return arr;
    }
}
