package datastructutes;

import java.util.ArrayList;

public class PeakValue {

	public static void main(String[] args) {
		int[] array = { 6, 40, 98, 34, 65, 87, 354, 500 };
		ArrayList<Integer> alist = new ArrayList<>();
		int count = array.length - 1;
		int i = 0;
		while (count > 0) {
			if (i == 0) {
				if (array[i] > array[i + 1]) {
					alist.add(array[i]);
				}
			} else if (i != 0 && i < count) {
				if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
					alist.add(array[i]);
				}

			} else if (i == count) {
				if (array[i] > array[i - 1]) {
					alist.add(array[i]);

				}

			}
			if (i < count) {
				i++;
			} else
				break;
		}
		System.out.println(alist);

	}

}
