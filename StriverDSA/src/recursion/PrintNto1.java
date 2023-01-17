package recursion;

public class PrintNto1 {

	
    static void printNos(int N) {
        
    	if(N < 1)
    		return;
    	
    	System.out.print(N+" ");
    	printNos(N - 1);
    }
	
	public static void main(String[] args) {
		printNos(1);
	}
}
