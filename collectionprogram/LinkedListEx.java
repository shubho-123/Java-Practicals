package collectionprogram;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list =new LinkedList<String>(); //generic
		list.add("Ram");
		list.add("Shyam");
		list.add("Ram"); //dupicate elsemet
		list.add(null); //null value can be add
		list.add(0,"Adding to 1st possition");
		
		for (String string : list) {
			System.out.println(string);
		}
		LinkedList<Object> list1=new LinkedList<Object>(); //Non-generic //Object class so Capital
		list1.add(12);
		
		
		for (Object object : list1) {
			System.out.println(object);
		}
	}

}
