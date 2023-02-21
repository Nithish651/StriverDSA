package arrays;

import java.util.Arrays;

public class LargestNumberInArray {

	//TC : O(n log n) for sorting sc : O(1)
    public static int largest(int arr[], int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    
    //TC : O(n) sc : O(1)
    public static int largestNumber(int arr[], int n) {
    	int max = Integer.MIN_VALUE;
    	
    	for(int i=0; i < n; i++) {
    		max = arr[i] > max ? arr[i] : max;
    	}
    	
    	return max;
    }
	
	public static void main(String[] args) {
		int [] arr = {3,6,2,1,4};
		
		System.out.println(largest(arr,arr.length));
		System.out.println(largestNumber(arr,arr.length));
	}                                        
}
