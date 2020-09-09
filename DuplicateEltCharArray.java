package datastructutes;

import java.util.ArrayList;

public class DuplicateEltCharArray {

	public static void main(String[] args) {
		char[] characterarray = {'a','r','f','s','p','g','r','s','p'};
	ArrayList<Character> repeat = new ArrayList<>();
		for (int i=0; i<characterarray.length;i++)
		{
			for(int j=i+1;j<characterarray.length;j++)
			{
				if(characterarray[i]== characterarray[j])
						{
							repeat.add(characterarray[i]);
						}
			}
		}
		System.out.println("Duplicates are" +repeat);
}
}
