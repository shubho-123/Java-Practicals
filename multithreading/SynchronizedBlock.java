package multithreading;


class PrintTable {
public void Pritn(int n)
{
	synchronized (this) //synchronized Block
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(n+" X "+i+" = "+ (n*i));
		}
	}
	
}
}




class Thread1 extends Thread{
	PrintTable referenceVariable;

	public Thread1(PrintTable referenceVariable) {
	//	super();
		this.referenceVariable = referenceVariable;
	}
	@Override
	public void run() {
		referenceVariable.Pritn(5);
	}
}




class Thread2 extends Thread{
	PrintTable referenceVariable;

	public Thread2(PrintTable referenceVariable) {
	//	super();
		this.referenceVariable = referenceVariable;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		referenceVariable.Pritn(9);
	}
}





public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable referenceVariable=new PrintTable();
		Thread1 th1=new Thread1(referenceVariable);
		Thread2 th2=new Thread2(referenceVariable);
	
		th1.start();
		th2.start();
	}

}
