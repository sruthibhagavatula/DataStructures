package datastructutes;

import java.util.ArrayList;

public class ArrayList0AtEnd {

	public static void main(String[] args) {
		int arr[]= {0,1,4,6,0,9,0,8};
		ArrayList<Integer> arrint0 = new ArrayList<>();
		ArrayList<Integer> arrintnonzero = new ArrayList<>();
		
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]==0)
			{	
				arrint0.add(0);
			}
			else if(arr[i] !=0)
			{
				arrintnonzero.add(arr[i]);
			}
		}
		//System.out.println(arrint0);
		//System.out.println(arrintnonzero);
		arrintnonzero.addAll(arrint0);
		System.out.println(arrintnonzero);

	}

}
