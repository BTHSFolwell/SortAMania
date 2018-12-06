
public abstract class SortCompetition implements Comparable <SortCompetition> {
	int number;
	double totalTime = 0.0;
	
	public int compareTo(SortCompetition t) {
		return (int)(this.totalTime - t.totalTime);
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

	public abstract int challengeOne(int[] arr);

	public abstract int challengeTwo(String[] arr, String query);

	public abstract int challengeThree(int[] arr);

	public abstract int challengeFour(int[][] arr);

	public abstract int challengeFive(Comparable[] arr, Comparable query);

	//Add a custom greeting so your sorter can introduce itself
	public abstract String greeting();

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

