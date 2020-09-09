package datastructutes;

import java.util.ArrayList;
import java.util.Collections;


public class HighestProduct {

	
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		//arrlist.addAll({2,4,6,8,1,5,9,2,4});
		arrlist.add(2);
		arrlist.add(9);
		arrlist.add(1);
		arrlist.add(6);
		arrlist.add(7);
		arrlist.add(5);
		arrlist.add(3);
		Collections.sort(arrlist); //sorts in ascending order
		System.out.println(arrlist);
		int count = (arrlist.size() - 1);
		System.out.println(arrlist.get(count)*arrlist.get(count-1));
		
		
		
	}

}
