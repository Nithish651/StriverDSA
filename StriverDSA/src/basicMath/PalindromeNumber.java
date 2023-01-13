package basicMath;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int num = x, rev = 0;
        
        
        while(num > 0) {
        	int ld = num % 10;
        	rev = rev  * 10 + ld;
        	num /= 10;
        }
        
        return rev == x;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
}
