package arrays;

import java.util.Arrays;

public class SecondLargest {

	//TC : O(n log n) sc : O(N) for not mutating the array. can be done in O(1)
	public static int secondLargest(int [] arr, int n) {
		int [] arrCopy = new int[arr.length];
		arrCopy = Arrays.copyOf(arr, n);
		Arrays.sort(arrCopy);
		return arrCopy[n-2];                         
	}
	
	public static int secondLargestNumber(int [] arr, int n) {
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		
		for(int i=0; i < n; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		
		return max2;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {999, 35, 1, 1000, 34, 1};
		System.out.println(secondLargestNumber(arr,arr.length));
	}
}
