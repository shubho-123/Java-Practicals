package multithreading;

public class JoinMethod extends Thread {

	public static void main(String[] args) {
		
		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		JoinMethod t3=new JoinMethod();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();	
		t3.start();
		
	
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	System.out.println(i);
	}
	}
}
