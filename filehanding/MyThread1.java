package filehanding;

public class MyThread1 extends Thread {
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run(); // not effect the program
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Executing Thread: "+getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 ob=new MyThread1();
		ob.setName("Shubhendu 9");
		ob.start();
		
		MyThread1 ob1=new MyThread1();
		ob1.setName("Ajay 6");
		ob1.start();
		
		System.out.println("Hello");
	}

}
