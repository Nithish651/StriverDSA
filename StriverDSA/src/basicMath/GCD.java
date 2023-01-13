package basicMath;

public class GCD {

	
	//Highest common factor. ie: the largest number that divides both the numbers.
	//loop till minimum because the larger number cannot divide the smaller number.
	//Runs in O(min(n1,n2))
	public static int gcd(int n1, int n2) {
		
		int n = Math.min(n1, n2);
		int gcd = 1;
		
		for(int i=1; i<= n; i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		
		return gcd;
	}
	
	//Euclidean Algorithm
	//gcd(a,b) -> gcd(a%b,b) where a > b
	//O(log (min(a,b))
	public static int gcd1(int a, int b) {
		
		while( a > 0 && b > 0) {
			if(a > b) {
				a = a%b;
			}else {
				b = b%a;
			}
		}
		
		if(a == 0) return b;
		else return a;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd1(52,10));
	}
}
