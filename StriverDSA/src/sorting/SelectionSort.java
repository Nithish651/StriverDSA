package sorting;

import java.util.Scanner;

public class SelectionSort {
	
	// iterate till n-2 because the minimum is always swapped with the first element of the non sorted portion
	// find the minimum in the unsorted portion
	// swap it with the first element of the unsorted portion.
	
	// TC : inner loop runs for
	//1 + 2 + ... +n-2 + n-1 + n
	// (n * n+1)/2 ~ O(n^2)
	public static void selectionSort(int[] arr, int n) {

		for (int i = 0; i <= n - 2; i++) {

			int min = i;
			// finding the minimum
			for (int j = i; j <= n - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// swap
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

	}
	

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int [] arr = new int [n];
		
		for(int i=0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		selectionSort(arr,arr.length);
		
		for(int it : arr) {
			System.out.print(it+" ");
		}
		
		scanner.close();
		
	}
}
