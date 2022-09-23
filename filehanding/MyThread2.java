package filehanding;

public class MyThread2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread2 obj1=new MyThread2();
		Thread threadclassObject1= new Thread(obj1);
		threadclassObject1.setName("Thread 2");
		threadclassObject1.start();
		
		MyThread2 obj2= new MyThread2();
		Thread threadclassObject2=new Thread(obj2);
		threadclassObject2.setName("Thread 5");
		threadclassObject2.start();

	}

	@Override
	public void run() {
		
		while(true)
		{
			try {
				Thread.sleep(1000);      					   //It is a Static method don't need obj of Thread Class to call the sleep();
				} 
			catch (InterruptedException e) 
			{
					e.printStackTrace();
			}
			System.out.println("Executing Thread: "+Thread.currentThread().getName());
		
		}
	}

}
