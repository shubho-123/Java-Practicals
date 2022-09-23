package hasaispractic;



public class Person {
	
		int id;
		String name;
		MyDate dob;
		public Person() {
			id=105;				//id=105
			name="Shubhendu";	//name=Shubhendu
			dob= new MyDate();
			
		
		}
		public Person(int id, String name, MyDate dob) {
			
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
