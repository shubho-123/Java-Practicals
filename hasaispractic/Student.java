package hasaispractic;

public class Student {
	int age,id;
	String name;
	

	public Student(int age, int id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(20, 102, "shubho");

		Student s2=new Student(22, 122, "Ajay");
		System.out.println(s1);
		System.out.println(s2);

	}

}
