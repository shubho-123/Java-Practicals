  package hasaispractic;
  
public class StudentHasA {
	int id;
	String name;
	MyDate dob;
	Address add;
	public StudentHasA() {
		id=105;
		name="Shubhendu";
		dob= new MyDate();
		add=new Address();
	}
	public StudentHasA(int id, String name, MyDate dob, Address ad) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.add=ad;
	}
	public void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		dob.display();
		add.display();
	}
}
