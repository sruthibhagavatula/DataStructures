package arrays_day1;

import java.util.Arrays;

import org.junit.Test;

public class SubArraySum {
	
	private int[] getSum(int[] numbers, int k) {
		for(int i = 0; i<numbers.length;i++)
		{
			int current_sum=numbers[i];
			if(current_sum==k)
			return new int[] {i,i};
			for(int j = i+1 ; j < numbers.length;j++)
			{
				current_sum +=numbers[j];
				if(current_sum>k)
				{
					break;
				}
				if (current_sum == k)
				{
					return new int[] {i,i};
				}
			}
		}
		
		
		throw new RuntimeException("no matching indices");
	}
	@Test
	public void example1() {
		int[] numbers = {0,3,2,4,6,1};
		int k=5;
		int[] Sumofsubarraysisequaltotarget= getSum(numbers,k);
		System.out.println(Arrays.toString(Sumofsubarraysisequaltotarget));
		
	}

	

}
