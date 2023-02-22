package arrays;

public class CheckIfArrayIsSorted {

	//TC : O(N)
	//SC : O(1)
	public static boolean check(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
	
	//leetcode variant P.1752 Check if Array Is Sorted and Rotated
	//The array can encounter decreasing order  maximum of one time if the array is sorted and rotated
	//the last element should be comparedwith first element for non decreasing order
	// TC : O(N)
	//SC : O(1)
	//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/solutions/3216674/java-o-n-solution/
	public static boolean checkArr(int [] arr) {
		int counter = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > arr[(i+1)%arr.length]) {
				counter++;
			}
		}
		return counter <= 1;
	}

	public static void main(String[] args) {
		int [] arr = {2,1,3,4};
		System.out.println(check(arr));
		System.out.println(checkArr(arr));
	}
}
