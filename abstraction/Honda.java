package abstraction;

public class Honda extends AbstractionFirst { //Honda=child AbstractionFirs=parent class
	public void run()
	{
		System.out.println("Ride Safly:");
	}
	
	
	public static void main(String[] args) {
		Honda h=new Honda();		//Creating obj of child class but always call first parent default constructor then call child default Constructor
									//^ it's only for default Constructor
		
		h.run();		//calling Child class method
		h.display();	//Calling Abstract Class method
	}

}
