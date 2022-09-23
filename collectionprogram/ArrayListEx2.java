package collectionprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Abc");
		System.out.println("Iterating the elements using Iterate:");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ArrayList list2=new ArrayList();
		list2.add("Abc");
		list2.add(12);
		list2.add(12.3);
		list2.add(null);
		list2.add(true);
		System.out.println("Iterating the elements using For-each loop:");
		for (Object object : list2) {
			System.out.println(object);
			
		}
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("RAhh");
		list1.add("Koushik");
		
		list.addAll(list1);           //listName(where we add).methodName(pass list name which list you want to add);
		System.out.println("Adding all the list inside another list");
		System.out.println("Inserting list1 inside list");
		for (String string : list) {   //Printing the List which you want ,Here I want to print list
			System.out.println(string); //for string type-->sting
										//for Hereogenious (mixed) type-->object
		}
		list.removeAll(list1);
		System.out.println("Remov all list from list");
		for (String string : list) {  //here I want to print list
			System.out.println(string);  //for string type-->sting
										//for Hereogenious (mixed) type-->object
		}
		

	}

}
