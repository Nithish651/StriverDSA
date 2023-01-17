package recursion;

public class Print1toN {

	
	public static void print(int n) {
		int counter = 1;
		print1(counter,n);
	}
	
	public static void print1(int counter, int n) {
		if(counter > n)
			return;
		
		System.out.print(counter+" ");
		print1(counter + 1, n);
	}
	
	public static void main(String[] args) {
		print(10);
	}
}
