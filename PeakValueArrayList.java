
package datastructutes;

import java.util.ArrayList;


public class PeakValueArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(6);
		alist.add(40);
		alist.add(98);
		alist.add(34);
		alist.add(65);
		alist.add(354);
		alist.add(500);
		ArrayList<Integer> alist1 = new ArrayList<>();
		int count = alist.size() - 1;
		int i = 0;
		while (count > 0) {
				if (i == 0) {
					if (alist.get(i) > alist.get(i+1)) {
						alist1.add(alist.get(i));
					}
				} else if (i != 0 && i < count) {
					if (alist.get(i) > alist.get(i+1) && alist.get(i) > alist.get(i-1)) {
						alist1.add(alist.get(i));
					}

				} else if (i == count) {
					if (alist.get(i) > alist.get(i-1)) {
						alist1.add(alist.get(i));

					}

				}
				if (i < count) {
					i++;
				} else
					break;
			}
			System.out.println(alist1);

		}
}
