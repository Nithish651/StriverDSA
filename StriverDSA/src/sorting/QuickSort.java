package sorting;

public class QuickSort {
	
	
	public static void quickSort(int [] arr, int low, int high) {
		//do only when there is more than one element
		if(low < high) {
			int partitionIndex = partition(arr,low,high);
			quickSort(arr,low,partitionIndex - 1);
			quickSort(arr,partitionIndex + 1,high);
		}
	}
	
	public static int partition(int [] arr, int low, int high) {
		
		int i = low;
		int j = high;
		int pivot = arr[low]; // fix the first element of the array as the pivot element.
		
		while(i < j) {
			//find first greater element than pivot from the left.
			while(arr[i]<= pivot && i <= high - 1) {
				i++;
			}
			
			//find the first smaller element than the pivot from the right side
			while(arr[j] >= pivot && j >= low + 1) {
				j--;
			}
			
			if( i < j) {
				swap(arr,i,j);
			}
		}
		
		swap(arr,low,j);
		return j;
	}
	
	public static void swap(int [] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {4,6,2,5,7,9,1,3};
		quickSort(arr, 0, arr.length - 1);
		
		for(int it : arr)
			System.out.print(it+" ");
	}
	
	
}
