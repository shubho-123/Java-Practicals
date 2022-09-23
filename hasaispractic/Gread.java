package hasaispractic;

public class Gread extends StudentIsAHierical {
	String grade;
	public Gread() {
		super();
	}
	public Gread(int id, String name,MyDate dob, int s1, int s2, int s3) {
		super(id,name,dob,s1,s2,s3);
		
	}
	public void calculate() {
		super.calculate();
		if(grade>90)
			grade="O";
		else if(grade>70)
			Grade="A";
		else if(grade>60)
			
		else 
			System.out.println("Fail");
	}
	

}
