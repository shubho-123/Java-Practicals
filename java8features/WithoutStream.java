package java8features;

import java.util.ArrayList;

public class WithoutStream {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("Ajay");
		list.add("Shubhendu");
		list.add("manas");
		list.add("Gopi");
		list.add("Riya");
		list.add("raj");
		
		int count=0;
		for (String s : list) {
			if(s.length()<5)
				count++;
		}
		System.out.println("There are "+count+" with length less then 5");
	}

}
