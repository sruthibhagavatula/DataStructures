package arrays_day1;

public class SortArraySingleForLoop {
			public static void main(String[] args) {

		int [] arr= {-10,12,-15,1,16,18,19,31,52,6};
		// 0- -10, 1 - 12,2- -15,3- 1,4- 16,5- 18,6- 19,7- 31,8- 52,9- 6

		for(int i=1;i< arr.length;i++) {

		if(arr[i] < arr[i-1] )
			//-15 < 12
		{

		arr[i] =arr[i] +arr[i-1];
		System.out.println(arr[i]);

		arr[i -1 ] = arr[i] -arr[i-1];
		System.out.println(arr[i-1]);

		arr[i] = arr[i] - arr[i-1];
		System.out.println(arr[i]);

		i=0;

		}

		}
		System.out.println("sorted Array :");

		for(int i=0;i<arr.length;i++) {

			System.out.println(arr[i] + " ");

}

}

}
