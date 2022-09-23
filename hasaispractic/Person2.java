package hasaispractic;

public class Person2 {
	int id;
	String name;
	MyDate dob;
	int s1,s2,s3;
	public Person2()
	{
		id=105;				//id=105
		name="Shubhendu";	//name=Shubhendu
		dob= new MyDate();
		s1=0;
		s2=0;
		s3=0;
	}
	
	public Person2(int id, String name, MyDate dob) {
		
		this.id = id;		//id=102
		this.name = name;	//name=Manas
		this.dob = dob;		//dob=new MyDate(12,5,1995)
	}
	public void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		dob.display();
	}
	

}
