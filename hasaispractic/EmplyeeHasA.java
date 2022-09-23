package hasaispractic;



public class EmplyeeHasA {
	int id;
	String name;
	MyDate dob;
	Address ad;
	public EmplyeeHasA() {
		id=000;
		name="Unkown";
		dob=new MyDate();
		ad=new Address();
		
	}
	public EmplyeeHasA(int id, String name, MyDate dob, Address ad) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.ad = ad;
	}
	public void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		dob.display();
		ad.display();
	}

}
