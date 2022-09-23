package collectionprogram;

import java.util.Comparator;

public class NameComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		
		return s1.name.compareTo(s2.name);
	}
	

}
