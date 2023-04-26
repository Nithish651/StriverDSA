package arrays;

public class SecondLargest {


	//TC : O(N) + O(N) = O(2N)
	//SC : O(1)
	public static int secondLargest(int n, int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}
	
	
	//TC : O(N)
	//SC : O(1)
	public static int secLargest(int n, int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {-3,-3,-3,-3,-3};
		System.out.println(secLargest(arr.length,arr));
	}
}
