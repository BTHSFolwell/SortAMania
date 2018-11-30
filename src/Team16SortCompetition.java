public class Team16SortCompetition extends SortCompetition {

    public int challengeOne(int[] arr) {
        /*  challengeOne: Standard sort and process
            Data Set - an array of 10,000 random integers between 0-10000
            Task: Sort the list and return the median */
        quickSort(arr, 0, arr.length - 1);
        return arr[(arr.length / 2) - 1];
    }

        private void quickSort(int[] arr, int x, int y) {
            if (x < y) {
                int z = part(arr, x, y);
                quickSort(arr, x, z - 1);
                quickSort(arr, z + 1, y);
            }
        }
        private int part(int[] arr, int x, int y) {
            int z = arr[y];
            int i = x - 1;

            for (int j = x; j < y; j ++) {
                if (arr[j] <= z) {
                    i ++;
                    int k = arr[i]; arr[i] = arr[j]; arr[j] = k;
                }
            }
            int l = arr[i + 1]; arr[i + 1] = arr[y]; arr[y] = l;
            return i + 1;
        }

    public int challengeTwo(String[] arr, String query) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length; j ++) {
                if (arr[i].compareTo(arr[j]) <= 0) {
                    String k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        boolean x = false; int lwr = 0; int upr = arr.length - 1; int mid = arr.length/2 - 1;
        while (!x) {
            if (query.compareTo(arr[mid]) > 0) {
                lwr = mid; mid = ((upr - lwr) / 2) + lwr;
            }
            else if (query.compareTo(arr[mid]) < 0) {
                upr = mid; mid = ((upr - lwr) / 2) + lwr;
            }
            else return mid;
            if (upr <= lwr || lwr == mid || upr == mid) {
                x = true;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length; j ++) {
                if (arr[i] > arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        return arr[(arr.length / 2) - 1];
    }

    public int challengeFour(int[][] arr) {
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            quickSort(arr[i], 0, arr[i].length - 1);
            medians[i] = arr[i][arr[i].length/2 - 1];
        }
        quickSort(medians, 0, medians.length - 1);
        return medians[medians.length/2 - 1];
    }

    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    public String greeting() {
        return "sup";
    }
}
/*
	challengeOne: Standard sort and process
	Data Set - an array of 10,000 random integers between 0-10000
	Task: Sort the list and return the median

	challengeTwo: String sorting and searching
	Data Set - an array of 10,000 random strings (strings will be of length 5)
	Task: Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found

	challengeThree: Mostly Sorted Big Array
	Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
	Task: Sort the list and return the median

	challengeFour: Multi-Dimensional sorting
	Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
	Task: Sort each sub-array and then sort the arrays by their median value
	Return the median of the median array

	challengeFive: Mystery Sort and Search
	Data Set - an array of 10,000 objects that implement the comparable interface
	Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
	Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order.
 */