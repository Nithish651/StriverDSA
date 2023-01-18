package recursion;

public class ReverseAnArray {

	//Iterative way
	//tc : O(N)
	//sc : O(1)
	static void reverse(int [] arr) {
		int left = 0;
		int right = arr.length - 1;
		int temp = 0;
		
		while(left < right) {
			temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
	}
	
	//Two pointer recursive
	//tc : O(N)
	//space : O(1) or O(N) auxilliary space recursive
	static void reverse1(int [] arr, int left, int right) {
		
		if(left >= right)
			return;
		
		int temp = 0;
		temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
		
		reverse1(arr,left+1, right-1);
	}
	
	//single pointer recursive way.
	//TC : O(N)
	//SC : O(1) or O(N) auxilliary space recursive
	static void reverse2(int [] arr, int index) {
		
		if(index >= (arr.length/2))
			return;
		
		int temp = 0;
		temp = arr[arr.length - index - 1];
		arr[arr.length - index - 1] = arr[index]; 
		arr[index] = temp;
		
		reverse2(arr,index+1);
	}
	
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		reverse2(arr,0);
		
		for(int it : arr) {
			System.out.print(it+" ");
		}
	}
}
