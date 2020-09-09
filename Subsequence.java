package datastructutes;

import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		int[] array = { 12, 3, 4, 5, 7, 8, 2, 10, 11, 14, 18, 9, 3, 2, 1, 6, 90, 20 };
		ArrayList<Integer> alist = new ArrayList<>();
		ArrayList<Integer> alist1 = new ArrayList<>();
		int count = array.length - 1;
		int i = 0;
		int lcount = 0;
		int lcount1 = 0;
		while (count > 0) {
			if (i == 0) {
				if (array[i] < array[i + 1]) {
					alist.add(array[i]);
				}
			} else if (i != 0 && i < count) {
				if (array[i] < array[i + 1]) {
					alist.add(array[i]);
				} else {
					//System.out.println(alist);
					lcount = alist.size();
					lcount1=alist1.size();
					if (lcount1 <= lcount) {
						alist1=new ArrayList<>();
						alist1.addAll(alist);
						alist = new ArrayList<>();
						
					}
				}
			} else if (i == count) {
				if (array[i] > array[i - 1]) {
					alist.add(array[i]);
				}
			} else
				break;
			if (i < count) {
				i++;
			} else
				break;
		}
		System.out.println(alist1);
	}
}
