package recursion;

public class Palindrome {

	//two pointer Iterative way to check if the string is reversed
	// tc : O(N) single pass
	// sc : O(1)
	static boolean isPalindrome(String s) {
		
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++; right--;
		}
		
		return true;
	}
	
	//single pointer iterative way
	//tc : O(N/2)
	//sc : O(1)
	static boolean isPalindrome1(String s) {
		int index = 0;
		
		while(index < s.length()/2) {
			if(s.charAt(index) != s.charAt(s.length() - index - 1)) {
				return false;
			}
			index++;
		}
		return true;
	}
	
	//single pointer recursive way
	
	static boolean isPalindrome3(String s) {
		return isPalindrome(0,s);
	}
	
	static boolean isPalindrome(int index, String s) {
		
		if(index >= s.length()/2)
			return true;
		
		if(s.charAt(index) != s.charAt(s.length() - index - 1))
			return false;
		else
			return isPalindrome(index+1, s);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("pop"));
		System.out.println(isPalindrome1("pop"));
		System.out.println(isPalindrome3("pop"));
	}
}
