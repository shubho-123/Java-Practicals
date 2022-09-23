package collectionprogram;

import java.util.ArrayList;

public class UserDefinedStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(101, 22, "Shubhhendu"));
		list.add(new Student(102, 24, "Raj"));
		list.add(new Student(103, 23, "Ajay"));
		
		System.out.println("For-each");
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
