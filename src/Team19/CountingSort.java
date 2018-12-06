package Team19;

public class CountingSort {
    public static void countingSort (int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int anArr2 : arr) {
            max = anArr2 > max ? anArr2 : max;
            min = anArr2 < min ? anArr2 : min;
        }

        int[] count = new int[max - min + 1];
        for (int anArr1 : arr) count[anArr1 - min]++;

        for (int i = 1; i < count.length; i++)
            count[i] = count[i] + count[i - 1];

        int[] output = new int[arr.length];
        for (int anArr : arr) {
            count[anArr - min]--;
            output[count[anArr - min]] = anArr;
        }

        System.arraycopy(output, 0, arr, 0, output.length);
    }
}
