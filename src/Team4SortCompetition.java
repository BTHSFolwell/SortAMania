public class Team4SortCompetition extends SortCompetition{
    //Challenge One
    @Override
    public int challengeOne(int[] arr) { //Standard sort and process--Mergesort
        return 0;
    }

    public static int[] randomIntsArr(int num){
        int []arr = new int[num];
        for(int i =0; i <arr.length; i++){
            arr[i] = (int)(Math.random()*1000);
        }
        return arr;
    }

    @Override
    public int challengeTwo(String[] arr, String query) { //string sorting and searching
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) { //mostly sorted big array
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {//multidimensional array
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) { //Mystery sort and search
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }
}
