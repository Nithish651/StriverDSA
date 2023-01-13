package basicMath;

public class ArmStrongNumber {

    static String armstrongNumber(int n){
        
    	int num = n, sum = 0;
    	
    	while(num > 0) {
    		int ld = num % 10;
    		sum += Math.pow(ld, 3);
    		num /= 10;
    	}
    	
    	return sum  == n ? "Yes" : "False";
    }
	
	public static void main(String[] args) {
		System.out.println(armstrongNumber(370));
	}
}
