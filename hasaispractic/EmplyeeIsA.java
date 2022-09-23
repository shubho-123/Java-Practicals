package hasaispractic;
public class EmplyeeIsA extends StudentHasA{
	float workingDay, workPer,salary;
	public EmplyeeIsA(){
		super();
		workingDay=26;	//used to call super class constructor
		workPer=1598;
	}
	public EmplyeeIsA(int id, String name, MyDate dob, Address add,float workingDay, float workPer) {
		super(id,name,dob,add);
		this.workingDay = workingDay;
		this.workPer = workPer;
		}
	public void calculate() {
		salary=workingDay*workPer;
	}
	public void display(){
		super.display();
		System.out.println("Salary: "+salary);
	}
}