package arrays;

public class MaximumConsecutiveOne {

    public static int findMaxConsecutiveOnes(int[] nums) {
    	
    	int counter = 0, maxCount = 0;
    	
    	for(int i=0; i < nums.length; i++) {
    		if(nums[i] == 1) {
    			counter++;
    			maxCount = Math.max(maxCount, counter);
    		}else {
    			counter = 0;
    		}
    	}
    	
    	return maxCount;
    }
	
	public static void main(String[] args) {
		int []nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
		
	}
}
