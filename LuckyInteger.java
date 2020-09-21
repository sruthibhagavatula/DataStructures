package assignment_day2;

import java.util.Arrays;

import org.junit.Test;

public class LuckyInteger {
	
	private int[] sortArray(int[] numbers) {
		int temp=0;
		for(int i = 0; i< numbers.length ; i++)
		  {
			for (int j = i+1; j < numbers.length; j++)
			{
				if(numbers[i] > numbers[j])
				{
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		return numbers;	
	}
	private int[] luckyNumbers(int[] sort)
	{
		int temp=0;
		int count=0;
		//0, 3,3,3, 2, 4, 6, 1
		//0,1,2,3,3,3,4,6
		for(int i = 0; i<sort.length;i++)
		{
			if(sort[i]==sort[i+1])
			{
				 temp=sort[i];
				count++;
			}
			
		}
		System.out.println(sort);
		return sort;		
	}
	//@Test
	public void example1() {
		int[] numbers = { 0, 3,3,3, 2, 4, 6, 1 };
		int [] sort = sortArray(numbers);
		System.out.println("\n sorting an array "+Arrays.toString(sort) );

	}
	@Test
	public void example2() {
		int[] numbers = { 0, 0, -1, 4, 6, 1 };
		/*
		 * int [] sort = sortArray(numbers);
		 * System.out.println("\n sorting given array "+Arrays.toString(sort) ); int []
		 * luckynumber= luckyNumbers(sort);
		 */
		
		System.out.println("\n lucky numbers of given array "+Arrays.toString(luckyNumbers(sortArray(numbers))));

	}
	
	//@Test
	public void example3() {
		int[] numbers = { -1, -4, -6, -1 };
		int [] squaresofarray = numbers;
		int [] squares = sortArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example4() {
		int[] numbers = { -5, -1, 4, -7, 6, -2, 8, -10,20,-6, 9 };
		int [] squaresofarray = numbers;
		int [] squares = sortArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example5() {
		int[] numbers = { -5 };
		int [] squaresofarray = numbers;
		int [] squares = sortArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example6() {
		int[] numbers = {  };
		int [] squaresofarray = numbers;
		int [] squares = sortArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}

}
