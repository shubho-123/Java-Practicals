package collectionprogram;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, 20, "Ram"));
		list.add(new Employee(102, 20, "Shyam"));
		list.add(new Employee(103, 25, "Jadu"));
		list.add(new Employee(104, 12, "Shubho"));
		list.add(new Employee(105, 23, "Ram"));
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		Collections.reverse(list);              // decending order
		System.out.println("Deccending order");
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
