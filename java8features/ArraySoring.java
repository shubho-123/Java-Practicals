package java8features;

import java.util.Arrays;

public class ArraySoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,15,5,3,2,100,4,19,15,24,2,7};
		System.out.println("Befor Sorting: ");
		for(int i: a)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nAfter sorting: ");
		Arrays.parallelSort(a);
		//Arrays.parallelSort(a,0,5); //(array ,StartIndex,EndIndex) //0 for Inclusive // 5 for Exclusive
		for(int i: a)
		{
			System.out.print(i+" ");
		}
	}

}
