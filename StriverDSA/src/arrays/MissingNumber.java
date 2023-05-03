package arrays;

public class MissingNumber {

    public static  int missingNumber(int[] nums) {
        
    	int xor1 = 0, xor2 = 0;
    	
    	for(int i=0; i < nums.length; i++) {
    		xor1 = xor1 ^ (i+1);
    		xor2 = xor2 ^ nums[i];
    	}
    	
    	return xor1 ^ xor2;
    }
	
	public static void main(String[] args) {
		int [] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}
}
