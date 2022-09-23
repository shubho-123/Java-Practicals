package multithreading;
class Customer{
	private int amount=10001;
	
	synchronized void withdraw(int amount) //amount=15000
	{
		System.out.println("Go to Withdraw:");
		if(this.amount<amount) 		//10001<15000		//this.amount="Instance Variable" //amount="Local Variable"
		{
			System.out.println("Less Balance....Waiting for Deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;	//20001-15000=5000
		System.out.println("Withdraw Completed:....Balance = "+this.amount); //this.amount=5000
	}
	
	synchronized void deposite(int amount) //10000
	{
		System.out.println("go to deposit Rs."+amount); //10000
		this.amount+=amount;  //10001+10000=20001
		notify();
	}
	
	
	}


public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj=new Customer();
		new Thread("Shubhendu")  //Other way to create Thread //"Shubhendu"= Implementing by the thread name //Thread=class by using new key word we creating Thread class object and not using ";" because we using Autonimous-Inner class  
		{
			public void run() 
			{
				obj.withdraw(15000); //objectName.methodName(value); //calling by the object of the Customer class to use the method feature of that class that is withdrow() // and passing value for that method taking integer value
			};				//After calling method we using ";" to end the object creation of the Thread class.
		}			//closing the inner class
		.start(); //stating the Thread by calling start() //we don't need any object(reference Variable) //Simply call by " . " operator then methodNAme();
		
		
		
		new Thread("Ajay")
		{
			public void run() 
			{
				obj.deposite(10000);
			};
		}.start();

	}

}
