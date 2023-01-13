package basicMath;

public class CountDigits {

	public static int numberOfDigits(int num) {
		int count = 0;
		int x = num;
		
		while(x > 0) {
			x /= 10;
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(numberOfDigits(1243));
	}
}
