public class Team11SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], arr[i + 1]);
            max = Math.max(arr[i], arr[i + 1]);
        }
        arr[0] = min;
        arr[arr.length - 1] = max;
        int mid = max / 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mid) {
                arr[mid - i] = arr[i];
            } else if (arr[i] > mid) {
                arr[mid + i] = arr[i];
            }
        }
        return mid;
    }

    public int challengeTwo(String[] arr, String query) {
        return -1;
    }

    public int challengeThree(int[] arr) {
        return -1;
    }

    public int challengeFour(int[][] arr) {
        return -1;
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return -1;
    }

    public String greeting() {
        return "hi";
    }


}
