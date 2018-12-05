public class runner {

    public static void main(String[] args)
    {
        Team10SortCompetition team10 = new Team10SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000,5);
        printArr(randIntArr);
        int median = team10.challengeOne(randIntArr);
        System.out.println("challenge 1 median equals: " + median);
        printArr(randIntArr);

        String[] randStrArr = randomStringArr(10000,5);
        String[] randStringArr2 = randomStringArr(10000,1);
        printArr(team10.challengeTwo(randStrArr,randStringArr2));

//        public static int randomStringArr(int num)
//        {
//            int randNum = (int) Math.random() * num;
//        }
    }

    public static int[] randomIntsArr(int x)
    {
        int[] z = new int[x];
        for(int i=0;i<x;i++)
        {
            z[i] = (int)(Math.random()*10000);
        }
        return z;
    }

    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                s = s.toUpperCase();
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static void printArr(int[] arr){
        String temp = "";
        for(int i=0;i<arr.length;i++){
            temp+= arr[i] + ", ";
        }
        System.out.println(temp);
    }
}
