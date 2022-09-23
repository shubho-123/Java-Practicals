package multithreading;

public class AccountSychronized {

	private int balance=6000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}
}
