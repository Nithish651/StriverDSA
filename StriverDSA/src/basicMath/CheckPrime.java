package basicMath;

public class CheckPrime {
	
	//A number is a prime if it has only two factors ie : the number itself and 1.
	
	//count the number of factors. if the count is 2. then it is a prime else it is not a prime.
	
	//TC : O(sqrt(n))
	static boolean isPrime(int n) {
		int count = 0;
		
		for(int i=1; i * i <= n; i++) {
			if(n % i == 0) {
				count++;
				if((n / i) != i) {
					count ++;
				}
			}
			

		}
		System.out.println(count);
		return count == 2 ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(11));
	}
}
