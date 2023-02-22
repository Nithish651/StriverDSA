package arrays;

public class RemoveDuplicatesInSortedArray {

	//TC : O(N)
	//SC : O(1)
	
	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;

		if (nums.length == 1)
			return 1;

		int slow = 0;

		for (int fast = 1; fast < nums.length; fast++) {

			if (nums[slow] != nums[fast]) {
				nums[++slow] = nums[fast];
			}
		}
		return slow + 1;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {};
		System.out.println(removeDuplicates(arr));
	}
    
}
