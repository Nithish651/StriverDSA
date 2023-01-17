package recursion;

public class PrintNtimes {

    public static void printGfg(int N) {
    	if(N < 1) return;
      int counter = 1;
      print(counter,N);
    }
	
	private static void print(int counter, int n) {
		if(counter > n)
			return;
		
		System.out.print("GFG ");
		print(counter+1, n);
	}

	public static void main(String[] args) {
		printGfg(5);
	}
}
