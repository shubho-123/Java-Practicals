package designpatterns;

import java.util.Scanner;

interface Prototype{
	public Prototype getclone();
}
class Employee implements Prototype{
	private int id;				//to use the encapsulation using private
	private String eName,address;
	private double salary;
	public Employee(int id, String eName, String address, double salary) {
		super();
		this.id = id;
		this.eName = eName;
		this.address = address;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + eName + ", address=" + address + ", salary=" + salary + "]";
	}



	@Override
	public Prototype getclone() {
		// TODO Auto-generated method stub
		return new Employee(id, eName, address, salary);
	}
}




public class PrototypePatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		String eName=sc.nextLine();
		String address=sc.nextLine();
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Salary: ");
		double salary=sc.nextDouble();
		
		Employee emp1= new Employee(id, eName, address, salary);
		System.out.println("Employee 1: "+emp1);
		
		Employee emp2 = (Employee) emp1.getclone();
		System.out.println("Employee 2: "+emp2);
		
	}

}
