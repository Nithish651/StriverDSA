package arrays;

import java.util.Scanner;

public class RotateArray {
	
	
	//brute
	public static void leftRotate(int[] arr, int k) {
		
		k = k % arr.length;
		
		if(k == 0)
			return;
		
		
		int[] temp = new int[k];

		// copy k items to temp;
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		// shift n-k items to the front
		for (int i = k; i < arr.length; i++) {
			arr[i - k] = arr[i];
		}

		// copy items from temp to back of the array.
		for (int i = arr.length - k; i < arr.length; i++) {
			arr[i] = temp[i - (arr.length - k)];
		}
	}
	
	//optimal
	public static void leftRotate1(int[] arr, int k, int n) {
		
		k = k % n;
		
		if(k == 0)
			return;
		
		//reverse first k elements
		reverse(arr, 0, k-1);
		//reverse next n-k elements
		reverse(arr, k, n-1);
		//reverse the entire array
		reverse(arr, 0, n-1);
		
	}
	
	private static void reverse(int[] arr, int start, int end) {

		int temp = 0;
		while (start < end) {
			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		int [] arr = new int [n];
		
		for(int i=0; i  < n; i++)
			arr[i] = scanner.nextInt();
		
		 k = scanner.nextInt();
		 
		 scanner.close();
		 leftRotate(arr,k);
		 
		 for(int it : arr)
			 System.out.print(it+" ");
	}
}
