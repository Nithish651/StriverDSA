package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfArrayElements {
	
	//TC : O(N) + O(P)
	//SC : O(P)
	public static void frequencyCount1(int arr[], int N, int P){
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int it : arr) {
			map.put(it, map.getOrDefault(it, 0)+1);
		}
		
		for(int i=1; i <= P; i++) {
			System.out.print(map.getOrDefault(i, 0)+" ");
		}
	}

    public static void frequencyCount(int arr[], int N, int P){
    	
    	int [] frequencyArray  = new int [P + 1];
    	
    	for(int it : arr) {
    		frequencyArray[it]++;
    	}
    	
    	for(int i=1; i <= P; i++) {
    		System.out.print(frequencyArray[i]+" ");
    	}
    }
	
	public static void main(String[] args) {
		int [] arr = {3,3,3,3};
		frequencyCount1(arr, 4, 3);
	}
}
