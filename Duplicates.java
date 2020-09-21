package arrays_day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Duplicates {

	private List getduplicates(int[] num) {
		//int[] output;
		List list = new ArrayList();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) { 
				if (num[i] == num[j]) {
					list.add(num[i]); //stack//O[N^2]
				}
			}	
		}
		/*
		 * output=new int[list.size()];//O[1] for(int index = 0; index < output.length ;
		 * index++) { output[index]= (int) list.get(index); //O[N] }
		 */
		return list;
		
	}
	//@Test
	public void example1() {
		int[] num = { 2, 1, 3,0,3,0, 4 };
		System.out.println(getduplicates(num));
	}
	@Test
	public void example2() {
		int[] num = {  -1, -1,-3, 3, -1,-8,-6,-8,-4,1 };
		System.out.println(getduplicates(num));
	}
	//@Test
	public void example3() {
		int[] num = { 2, -1, -3, 1, 3, -1, 0,3,0, 4 };
		System.out.println(getduplicates(num));
	}
	//@Test
	public void example4() {
		int[] num = { 2,-3, 1, -1,3,0, 4 };
		System.out.println(getduplicates(num));
		System.out.println("There are no duplicates in this array");
	}
	//@Test
	public void example5() {
		int[] num = { 2,2,2-3, 1, -1,3,0, 4 };
		System.out.println(getduplicates(num));
		
	}
}
