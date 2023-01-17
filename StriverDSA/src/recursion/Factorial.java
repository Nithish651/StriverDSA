package recursion;

public class Factorial {
	
	//tc : O(N)
	//sc : O(N) auxilliary space recursive

	//parameterized recursion
	
	static void factorial(int n, int result) {
		
		if(n == 1) {
			System.out.println(result);
			return;
		}
		
		factorial(n - 1, result * n);
			
	}
	
	
	//functional recursion
	
	static int factorial(int n) {
		
		if(n == 1)
			return 1;
		
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		factorial(5,1);
		System.out.println(factorial(5));
	}
}
