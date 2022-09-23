package collectionprogram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Ram"); //dupicate elsemet
	//	list.add(null); //null value can be added but not sorted because it is not Comparaable and Comaparator
		list.add(0,"Shubhendu(Adding to 1st possition)");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(01);
		list1.add(50);
		Collections.sort(list1);
		for (Integer integer : list1) {
			System.out.println(integer);
		}
	}

}
