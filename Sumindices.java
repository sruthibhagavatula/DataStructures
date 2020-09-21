package arrays_day1;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class Sumindices {

	private int[] getsumindices(int[] numbers, int target) {
		for(int i = 0; i<numbers.length;i++)
		{
			for (int j = 0; j < numbers.length; j++) {
				if(numbers[i]+numbers[j]==target)
				{
					System.out.println("The indices" + i+ "&" +j);
					return new int[] {i,j};
				}
				
			}
		}
		throw new RuntimeException("There is no atching indices");
		

	}
	
	@Test
	public void example1() {
		int[] numbers = {2,3,4,6,1};
		int target=5;
		int[] Sumofnumbersisequaltotarget= getsumindices(numbers, target);
		System.out.println(Sumofnumbersisequaltotarget);
		
	}

}
