package multithreading;

public class AccountSynChronizedMethod implements Runnable {
	
	private AccountSychronized obj=new AccountSychronized(); //     

	public static void main(String[] args) {
		
		AccountSynChronizedMethod obj2=new AccountSynChronizedMethod();
		Thread th1=new Thread(obj2);
		Thread th2=new Thread(obj2);
		th1.setName("Shubhendu");
		th2.setName("Ajay");
		th1.start();
		th2.start();
		
		

	}

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			obj.withdraw(1000);
		}
	}
	
	private synchronized void makeWithdraw(int amount)
	{
		if(obj.getBalance()>=amount)
		{
			System.out.println(Thread.currentThread().getName()+"Is going to Withdraw");
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" Balance: "+obj.getBalance());
		}
		else
		{
			System.out.println("Not Enough balance in account for "+Thread.currentThread().getName()+" balance: "+obj.getBalance());
		}
	}

}
