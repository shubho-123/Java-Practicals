package abstraction;

public abstract class CreatAbstraction {
	
	public abstract void message();
	
}
	
	
	 public class ClassFirst extends CreatAbstraction{

		@Override
		public void message() {
			System.out.println("This is the First Subclass");
			
		}
		
	}
	 class ClassSecond extends CreatAbstraction{

		@Override
		public void message() {
			System.out.println("This is the Second Subclass");
			
		}
		

	public static void main(String[] args) {  
		
		
		ClassFirst obj1=new ClassFirst();
		ClassSecond obj2=new ClassSecond();
		
		obj1.message();
		obj2.message();
	}

}
	
