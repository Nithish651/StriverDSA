package arrays;

public class LinearSearch {

	//1,2,3,4,5,6
	//Binary search
	//TC : O(log n)
	public static int searchSorted(int[] arr, int k) {

		int left = 0;
		int right = arr.length - 1;
		int mid = 0;

 		while (left <= right) {
			mid = left + (right - left) / 2;

			if (arr[mid] == k) {
				return 1;
			} else if (arr[mid] < k) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,56};
		System.out.println(searchSorted(arr,56));
	}

}
