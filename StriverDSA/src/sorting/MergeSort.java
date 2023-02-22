package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int low, int high) {

		if (low >= high)
			return;

		// find the middle point
		int mid = (low + high)/ 2;

		// merge sort firsdt half
		mergeSort(arr, low, mid);
		// merge sort the second half
		mergeSort(arr, mid + 1, high);

		// merge the two halves
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int left = low;
		int right = mid + 1;
		int[] temp = new int[arr.length];
		int index = low;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp[index] = arr[left];
				left++;
			} else {
				temp[index] = arr[right];
				right++;
			}
			index++;
		}

		while(left <= mid) {
			temp[index] = arr[left];
			index++;
			left++;
		}

		while(right <= high) {
			temp[index] = arr[right];
			index++;
			right++;
		}
		// copy the elements beck to the original array
		
		for (int i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4,3 ,2,1};
		sort(arr);
		for(int it : arr) {
			System.out.print(it+" ");
		}
		
	}
}
