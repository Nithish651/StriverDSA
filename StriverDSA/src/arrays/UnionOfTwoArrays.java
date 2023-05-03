package arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoArrays {

	public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		int p1 = 0;
		int p2 = 0;
		
		ArrayList<Integer> union = new ArrayList<>();
		
		while(p1 < n && p2 < m) {
			
			if(arr1[p1] <= arr2[p2]) {
				if(union.isEmpty() || !union.contains(arr1[p1])) {
					union.add(arr1[p1]);
				}
				p1++;
			}else {
				if(union.isEmpty() || !union.contains(arr2[p2])) {
					union.add(arr2[p2]);
				}
				p2++;
			}
		}
		
		while(p1 < n) {
			if(union.isEmpty() || !union.contains(arr1[p1])) {
				union.add(arr1[p1]);
			}
			p1++;
		}
		
		while(p2 < m) {
			if(union.isEmpty() || !union.contains(arr2[p2])) {
				union.add(arr2[p2]);
			}
			p2++;
		}
		
		return union;
	}

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,6};
		int [] arr2 = {2, 3,5};
		 System.out.println(union(arr1,arr2));
	}
}
