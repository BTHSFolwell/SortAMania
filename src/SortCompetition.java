
public abstract class SortCompetition implements Comparable<SortCompetition> {
    int number;
    double totalTime = 0.0;

    public int compareTo(SortCompetition t) {
        return (int) (this.totalTime - t.totalTime);
    }

    public void setNumber(int n) {
        number = n;
    }

    public int getNum() {
        return number;
    }

    public void addTime(double avg) {
        totalTime += avg;
    }

    /**
     * challengeOne: Standard sort and process
     * Task: Sort the list and return the median.
     *
     * @param arr an array of 10,000 random integers between 0-10000.
     * @return the median of the array.
     */
    public abstract int challengeOne(int[] arr);

    /**
     * challengeTwo: String sorting and searching
     * Task: Sort the list and determine if it contains a given string.
     *
     * @param arr   an array of 10,000 random strings (strings will be of length 5).
     * @param query the string to search for.
     * @return the index of the first instance of {@code str}, or -1 if not found
     */
    public abstract int challengeTwo(String[] arr, String query);

    /**
     * challengeThree: Mostly Sorted Big Array
     * Task: Sort the list and return the median.
     *
     * @param arr a mostly sorted array of 100,000 integers (>75% of elements are in the correct order).
     * @return the median of the array.
     */
    public abstract int challengeThree(int[] arr);

    /**
     * challengeFour: Multi-Dimensional sorting
     * Task: Sort each sub-array and then sort the arrays by their median value.
     *
     * @param arr a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000.
     * @return the median of the median array.
     */
    public abstract int challengeFour(int[][] arr);

    /**
     * challengeFive: Mystery Sort and Search
     * Task: Sort the array by the compareTo method, and determine if it contains the element given.
     *
     * @param arr an array of 10,000 objects that implement the comparable interface.
     * @return the position of the object, or -1 if not found.
     */
    public abstract int challengeFive(Thingy[] arr, Thingy query);

    //Add a custom greeting so your sorter can introduce itself
    public abstract String greeting();
}
