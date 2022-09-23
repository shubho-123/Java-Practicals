package hasaispractic;

import classandobject.Person2;

public class StudentIsAHierical extends Person2 {

	float tatal,per;
	int s1,s2,s3;
	public StudentIsAHierical()
	{
		super();
		
	
	}
	public StudentIsAHierical(int id, String name,MyDate dob, int s1, int s2, int s3) {
		super(id,name,dob);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public void calculate()
	{
		tatal=s1+s2+s3;
		per=tatal/3;
	}
	public void display()
	{
		super.display();
		System.out.println("Total: "+tatal);
		System.out.println("Percentage: "+per);

	}
}
