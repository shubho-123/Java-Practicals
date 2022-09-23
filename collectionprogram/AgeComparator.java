package collectionprogram;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age)
		return 0;
		else if(s1.age>s2.age)
			return 1;
		else 
			return -1;
	}
	

}
