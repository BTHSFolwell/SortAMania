package Team19;

public class Utilities {
    public static int calculateMedian(int[] arr) {
        return arr.length % 2 == 1 ? arr[arr.length / 2] : (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
    }

    public static int calculateMedian(int[][] arr) {
        int mid0 = calculateMedian(arr[arr.length / 2]);
        int mid1 = arr.length % 2 == 1 ? mid0 : calculateMedian(arr[arr.length / 2 - 1]);
        return (mid0 + mid1) / 2;
    }
}
