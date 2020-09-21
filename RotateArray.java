package arrays_day1;

import org.junit.Test;

public class RotateArray {
	private int[] rotateArray(int[] numbers, int element) {
		for(int i = 0; i<numbers.length;i++)
		{
		}
		return numbers;

	}
	
	@Test
	public void example1() {
		int[] numbers = {2,1,3,1,3,1,3,4};
		int element=0;
		int position= numbers.length - element;
		int[] totalNumberOfDuplicates= rotateArray(numbers, element);
		System.out.println(totalNumberOfDuplicates);

	}
}
