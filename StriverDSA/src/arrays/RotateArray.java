package arrays;

public class RotateArray {

	 public static void leftRotate(int [] nums, int k) {
		 
		 if(nums.length == 1)
			 return;
		 
		 //reverse the array from 0 to n-1
		 reverse(nums,0,nums.length-1);
		 
		 //reverse the array from 0 to n-k-1 (first n-k numbers)
		 reverse(nums,0,nums.length-k-1);
		 
		 //reverse the array from n-k to n-1 (remaining k numbers)
		 reverse(nums,nums.length - k, nums.length -1 );
	 }
	 
	 public static void rightRotate(int [] nums, int k) {
		 
		 if(nums.length == 1)
			 return;
		 
		 //reverse the array from 0 to n-1 
		 reverse(nums,0,nums.length - 1);
		 
		 //reverse the array from 0 to k-1 (first k numbers)
		 reverse(nums,0,k-1);
		 
		 //reverse the array from k to n-1 (remaining n-k numbers)
		 reverse(nums,k ,nums.length-1);
	 }
	

	private static void reverse(int[] nums, int start, int end) {
		
		int left = start;
		int right = end;
		int temp = 0;
		
		while(left < right) {
			temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}


	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7};
		
		//leftRotate(arr,2);
		
		rightRotate(arr,2);
		
		for(int it : arr)
			System.out.print(it+" ");
		
	}
}
