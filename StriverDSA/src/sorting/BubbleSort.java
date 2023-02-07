package sorting;

public class BubbleSort {

	//the largest element goes to the last index of the unsorted section in every iteration.
	//the unsorted section length reduces by 1 on every iteration
	//when the array is ordered ie: no swap happened after the first pass. no need to move further(Optimization)
	
	//TC : inner loop runs for n + n-1 + n-2 + ... +1 sum of natural numbers
	//outer loop runs for n 
	// (n * n+1)/2 ~ O(n^2) -> worst case and average case.
	//best case ie : the array is already sorted. ~ O(N)
	public static void bubbleSort(int [] arr, int n) {
		
		for(int i = n-1; i>=1; i--) {
			int didSwap = 0;
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					didSwap = 1;
				}
			}
			if(didSwap == 0) {
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
			int [] arr = {1,2,3,4,5,6};
			bubbleSort(arr,arr.length);
			
			for(int it : arr) {
				System.out.print(it+" ");
			}
	}
}
