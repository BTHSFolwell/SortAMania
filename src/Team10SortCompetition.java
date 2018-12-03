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

}
