package arrays_day1;

import java.util.List;

import org.junit.Test;

public class SlidingWindowTechnique {
	private int getMaxSum(int[] numbers, int target) {
		int sum=0;
		
		if(target>numbers.length)
		{
			System.out.println("invalid target sent");
		}
		
		for(int i = 0; i<target;i++)
		{
			sum+=numbers[i];		
		}
		int previoussum=sum;
		for(int i=target;i<numbers.length;i++)
		{
			previoussum+=numbers[i]-numbers[i-target];
			sum=Math.max(previoussum, sum);
		}
		return sum;	
	}
	
	@Test
	public void example1() {
		int[] numbers = {2,3,4,6,1};
		int target=3;
		int Sumofnumbersisequaltotarget= getMaxSum(numbers,target);
		System.out.println(Sumofnumbersisequaltotarget);
		
	}
}
