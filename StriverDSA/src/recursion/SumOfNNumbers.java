package recursion;

public class SumOfNNumbers {

	//parameterized recursion
	
	//does not return anything. parameters hold the result.
	
	//tc : O(N) Auxilliary space : O(N) recursive
	
	static void sum(int n, int sum) {
		
		if(n < 1) {
			System.out.println(sum);
			return;
		}
		
		sum(n - 1, sum + n);
	}
	
	
	//functional recurssion. 
	// the function will return the result
	static int sum1(int n) {
		
		if(n < 1)
			return 0;
		
		return n + sum1(n - 1);
	}
	
	public static void main(String[] args) {
		sum(6,0);
		System.out.println(sum1(6));
	}
}
