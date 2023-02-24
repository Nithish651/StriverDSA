package arrays;

public class MoveZeroesToSide {

	
	//Have two pointers.. left pointer will point where next non zero element should be
	//The right pointer always looks for a non zero element in the array
	//when the right pointer finds a non zero element it swaps with the left pointer
	//and the left pointer will move to right which is the next place where the non zer elment must be
	
	
	//TC : O(N)
	//SC : O(1)
	
	public static void moveZeroes(int[] nums) {

		if (nums.length == 1)
			return;

		int left = 0;

		for (int right = 0; right < nums.length; right++) {
			if (nums[right] != 0) {
				if (left != right) {
					swap(nums, left, right);
				}
				left++;
			}
		}
	}
	
	private static void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}

	public static void main(String[] args) {
		int [] nums = {0};
		moveZeroes(nums);
		
		for(int it : nums)
			System.out.print(it+" ");
	}
}
