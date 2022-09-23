package collectionprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementClassesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();			//implemrnts Set in HashSet
		s.add("Appale");
		s.add("orange");								//we can use add(), {add() is from collection} because set is a child of collection it can use all the methods in  parents class 
		s.add("Guava");
		s.add("mango");
		s.add("mango");
		s.add(null);
		
		System.out.println("Implements HashSet : In Randome order ");
		for (String string : s) {			//iterate s
			System.out.println(string);
		}
			
		LinkedHashSet<String> s1=new LinkedHashSet<String>();
		
		s1.add("orange");
		s1.add("Guava");
		s1.add("mango");
		s1.add("Appale");
		s1.add("mango");
		s1.add(null);
		
		System.out.println("Implements LinkedHashSet : In Insertion order ");
		for (String string : s1) {      //iterate s1
			System.out.println(string);
		}
		
		TreeSet<String> s2=new TreeSet<String>();
		s2.add("Appale");
		s2.add("orange");
		s2.add("Guava");
		s2.add("mango");
		s2.add("mango");
	//	s2.add(null);        //you can't store null, you get NullPointerException
		
		System.out.println("Implements TreeSet : In Accending  order ");
		for (String string : s2) {		//iterate s2
			System.out.println(string);
		}
		
		
	}

}
