package collectionprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> list=new ArrayList<Student1>();
		list.add(new Student1(101, "Shubhendu", 20));
		list.add(new Student1(102, "Shubhendu", 13));
		list.add(new Student1(103, "Ram", 20));
		list.add(new Student1(104, "Shyam", 10));
		list.add(new Student1(105, "Ajay", 25));
		list.add(new Student1(106, "Tanu", 21));
		
		System.out.println("Sorting basis of age: ");
		Collections.sort(list, new AgeComparator());
		for (Student1 student1 : list) {
			System.out.println(student1);
		}
		
		System.out.println("Sortying by Name:");
		Collections.sort(list, new NameComparator());
		for (Student1 student1 : list) {
			System.out.println(student1);
		}
	}

}
