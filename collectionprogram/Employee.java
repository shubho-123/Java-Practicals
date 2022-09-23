package collectionprogram;

public class Employee implements Comparable<Employee>{ // add Unimplemented method
	
	int id,age;
	String name;
	
	

	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}



	@Override
	public int compareTo(Employee r) {      //Assending logic
		// TODO Auto-generated method stub
		if(age==r.age)
		return 0;				//place will not change remain same
		else if(age>r.age)		//you also got dessending by changing logic
			return 1;         // return -1;
		else
			return -1;        //return 1;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
	

}
