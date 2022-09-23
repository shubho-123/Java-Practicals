package hasaispractic;

public class StaticStudent {
	int id;
	String name;
	static String collageName="\tAsansol Engineering College";
	

	public StaticStudent(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		System.out.println(id+" "+name+collageName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticStudent s1=new StaticStudent(116, "Shubhendu");
		StaticStudent s2=new StaticStudent(101, "xyz");
		s1.display();
		s2.display();
	}

}
