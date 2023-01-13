package basicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {

	
	//O(N)
    static void printAllDivisors(int N){
        
        for(int i=1; i<=N; i++ ) {
        	if(N % i == 0)
        		System.out.print(i+" ");
        }
    }
    
    //O(sqrt(n)) + O(n Of divisors log( n Of divisors) + O(divisors)
    static void printDivisors(int n) {
    	List<Integer> divisors = new ArrayList<>();
    	
    	//O(sqrt(n))
    	for(int i=1; i * i <= n; i++) {
    		if(n % i == 0) {
    			divisors.add(i);
    			if(n/i != i) {
    				divisors.add(n/i);
    			}
    		}
    	}
    	//O(n Of divisors log( n Of divisors)
    	Collections.sort(divisors);
    	
    	//O(divisors)
    	for(int it : divisors) 
    		System.out.print(it+" ");
    }
    
	public static void main(String[] args) {
		printDivisors(36);
	}
}
