package arrays;

import java.util.ArrayList;

public class UnionOfTwoArrays {

	public static ArrayList<Integer> union(int[] arr1, int[] arr2) {

		int p1 = 0;
		int p2 = 0;
		ArrayList<Integer> union = new ArrayList<>();
		while (p1 < arr1.length && p2 < arr2.length) {

			if (arr1[p1] <= arr2[p2]) {
				if (union.isEmpty() || !union.contains(arr1[p1])) {
					union.add(arr1[p1]);
					p1++;
				} else if (!union.contains(arr2[p2])) {
					union.add(arr2[p2]);
					p2++;
				}else {
					break;
				}
			}
		}

		while (p1 < arr1.length) {
			if (!union.contains(arr1[p1]))
				union.add(arr1[p1]);
			p1++;
		}

		while (p2 < arr2.length) {
			if (!union.contains(arr2[p2]))
				union.add(arr2[p2]);
		}

		return union;
	}

	public static void main(String[] args) {
		int [] arr1 = {1, 1, 1, 1, 1};
		int [] arr2 = {2, 2, 2, 2, 2};
		 System.out.println(union(arr1,arr2));
	}
}
