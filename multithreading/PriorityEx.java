package multithreading;

public class PriorityEx extends Thread{

	
	public static void main(String[] args) {
		PriorityEx thread1=new PriorityEx();
		PriorityEx thread2=new PriorityEx();
		thread1.setName("Thread name Ajay");
		thread2.setName("Thread name Shubhendu");
		thread1.setPriority(MAX_PRIORITY);			//You can use==> (MAX_PRIORITY) / (Thread.MAX_PRIORITY) / (10)
		thread2.setPriority(Thread.MIN_PRIORITY);	//You can use==> (MIN_PRIORITY) / (Thread.MIN_PRIORITY) / (1)
		thread1.start();
		thread2.start();
	}
	@Override
	public void run() {
		System.out.println("Thread Name: "+getName()+" Priority NAme "+getPriority()); //here we are not using Thread.currentThread().getName() for Thread Name Because We extends the Thread Class in PriorityEx class, from child class (PriorityEx) we can access the parent class (Thread) property (getName()) 
																						//Also same for getPriority()
	}
}
