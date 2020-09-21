package arrays_day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Duplicates_set {
	private Set<Integer> getduplicates(int[] num) {
		Set<Integer> repeat = new TreeSet<Integer>();

		// ArrayList<Integer> repeat = new ArrayList<>();

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					repeat.add(num[i]);
				}
			}
		}
		// System.out.println("Duplicates are" +repeat);

		return repeat;
	}

	/*
	 * private Integer[] repeatUsinfOneForLoop(int[] num) { for(int i = 0 ;
	 * i<num.length ; i++) { Integer [] array = new array(i+1 to num.length);
	 * 
	 * if(array.contains or indexOf num[i] add to output array
	 * 
	 * } ArrayList<Integer> output = new ArrayList<Integer>(); for(int i = 0; i
	 * <num.length ; i++) { int[] array = Arrays.copyOfRange(num, i+1, num.length);
	 * System.out.println(array); System.out.println(num[i]); List lst =
	 * Arrays.asList(array); if((Arrays.asList(array).get(0)).contains(new int[]
	 * {num[i]})) { output.add(num[i]); }
	 * 
	 * //1,2,3,4,5,1 1 2,3,4,5,1 } return (Integer[]) output.toArray(); }
	 */

	// @Test
	public void example1() {
		int[] num = { 2, 1, 3, 0, 3, 0, 4 };
		System.out.println(getduplicates(num));
	}

	// @Test
	public void example2() {
		int[] num = { -1, -3, 3, -1, -8, -6, -8, -4 };
		System.out.println(getduplicates(num));
	}

	// @Test
	public void example3() {
		int[] num = { 2, -1, -3, 1, 3, -1, 0, 3, 0, 4 };
		System.out.println(getduplicates(num));
	}

	// @Test
	public void example4() {
		int[] num = { 2, -3, 1, -1, 3, 0, 4 };
		System.out.println(getduplicates(num));
		System.out.println("There are no duplicates in this array");
	}

	//@Test
	public void example5() {
		int[] num = { 2, 2, 2 - 3, 1, -1, 3, 0, 4 };
		//System.out.println(repeatUsinfOneForLoop(num));

	}
}
