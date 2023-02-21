package sorting;

import java.util.Scanner;

public class InsertionSort {

	//start  iterating from the first element and find its 
	//corresponding postiton   by comparing it with the previous element.
	// TC : the inner while loop on a worst case runs till the end of the array.
	//  the worst and average case is O(n^2)
	//best case when the array is already sorted. it is O(n)
	public static void insertionSort(int [] arr) {
		
		for(int i=0; i < arr.length; i++) {
			int j = i;
			// avoiding array out of bounds
			while(j > 0 && arr[j] < arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = scanner.nextInt();
		int [] arr = new int[length];
		
		for(int i=0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		insertionSort(arr);
		
		for(int it : arr) {
			System.out.print(it+" ");
		}
		
	}
}
