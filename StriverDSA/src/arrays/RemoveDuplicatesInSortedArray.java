package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInSortedArray {

	//TC : O(N) + O(log n)
	//SC : O(N)
	public static int removeDuplicates(ArrayList<Integer> arr, int n) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(arr.get(i));
		}

		int i = 0;

		for (Integer integer : set) {
			arr.add(i, integer);
			i++;
		}
		return i;
	}
	
	
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
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,5,6));
		
		System.out.println(removeDuplicates(list,list.size()));
		System.out.println(list);
	}
    
}
