package assignment_day2;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SortSquaresOfEachArray {
	@Test
	public void example1() {
		int[] numbers = { 0, 3, 2, 4, 6, 1 };
		int [] squaresofarray = numbers;
		int [] squares = sortingGivenArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example2() {
		int[] numbers = { 0, 0, -1, 4, 6, 1 };
		int [] squaresofarray = numbers;
		int [] squares = sortingGivenArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example3() {
		int[] numbers = { -1, -4, -6, -1 };
		int [] squaresofarray = numbers;
		int [] squares = sortingGivenArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example4() {
		int[] numbers = { -5, -1, 4, -7, 6, -2, 8, -10,20,-6, 9 };
		int [] squaresofarray = numbers;
		int [] squares = sortingGivenArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example5() {
		int[] numbers = { -5 };
		int [] squaresofarray = numbers;
		int [] squares = sortingGivenArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	//@Test
	public void example6() {
		int[] numbers = {  };
		int [] squaresofarray = numbers;
		int [] squares = sortingGivenArray(squaresofarray);
		System.out.println("\n squares of given array "+Arrays.toString(squares) );

	}
	private int[] sortingGivenArray(int[] numbers) {
		
		System.out.println("Elements given in input ");
		for(int i = 0; i< numbers.length ; i++)
		{
			  System.out.print(numbers[i] + " "); 
		}
		int temp=0;
		int[] arr = new int[numbers.length];
		int[] sortsquarearray = arr;
		for(int i = 0; i< numbers.length ; i++)
		{
			arr[i]=numbers[i]*numbers[i]; 
		}
		
		//sorting array
		for(int i = 0; i< arr.length ; i++)
		  {
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=sortsquarearray[i];
					sortsquarearray[i]=sortsquarearray[j];
					sortsquarearray[j]=temp;
				}
			}
		}
		return sortsquarearray;
	}
}
	 
	
	
	 



