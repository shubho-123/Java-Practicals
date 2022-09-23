package multithreading;

public class DaemonThreadEx extends Thread{

	public static void main(String[] args) {
		
		DaemonThreadEx t1=new DaemonThreadEx();
		DaemonThreadEx t2=new DaemonThreadEx();
		DaemonThreadEx t3=new DaemonThreadEx();
		t1.start();
		t2.setDaemon(true); //t2 is a user Thread // setDaemon is use to change user Thread into Daemon thread // If you want to setDaemon then pass in parameter AS true of flash
		t2.start();
		t3.start();

	}
	
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())  //the currentThread() is used to Take current Thread // to call this method we using ClassName.methodName() --> As Thread.currentThread()
		{										//isDaemon() is used to check currentThread is a Daemon thread or user thread.
			System.out.println("Daemon Thread");
		}
		else
		{
			System.out.println("User Thread");
		}
	}
}
