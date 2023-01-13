package basicMath;

public class ReverseInteger {

  //O(log(10(N))
	public static int reverse(int num) {
		int x = num < 0 ? -1 * num : num;
		int reversed =0;


		while(x != 0) {
			int last = x % 10;
			x /= 10;
			reversed = reversed * 10 + last;
		}
	
		return num < 0 ? -1 * reversed : reversed;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
}
