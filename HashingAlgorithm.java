package arrays_day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



import org.junit.Test;

public class HashingAlgorithm {
	@Test
	public void example1() {
		int[] numbers = {0,3,2,4,6,1};
		int target=5;
		//int[] Sumofsubarraysisequaltotarget= getExactSum(numbers,target);
		System.out.println(Arrays.toString(getExactSum(numbers,target)));
		
	}

	private int[] getExactSum(int[] numbers, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		//initialize the map with negative number
		map.put(0, -1);
		//what is the sum so far
		int sum_so_far = 0;
		for(int i =0; i<numbers.length; i++)
		{
			sum_so_far+=numbers[i];
			int diff = sum_so_far - target;
			//check the difference is there in the hash
			if(map.containsKey(diff))
			{
				System.out.println("found matching sub array {"+(map.get(diff)+1)+", "+ i + "}");
				
			}
			map.put(sum_so_far, i);
		}
		throw new RuntimeException("no matching");
	}

}
