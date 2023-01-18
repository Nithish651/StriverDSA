package recursion;

public class Fibonocci {

	static int fibonocci(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibonocci(n-1) + fibonocci(n-2);
	}
	
	
	public static void main(String[] args) {
		System.out.println(fibonocci(3));
	}
}
