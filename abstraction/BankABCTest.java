package abstraction;

 abstract class  Bank
 {
	public abstract void getBalance();

}
 class BankA extends Bank{
	@Override
	public void getBalance()
	{
		System.out.println("Deposite: 100");
	}
}
 class BankB extends Bank
{
	@Override
	public void getBalance()
	{
		System.out.println("Deposite: 150");
		
	}
}
public class BankABCTest
{
	public static void main(String[] args) {
		Bank a,b,c;
		 a=new BankA();
		a.getBalance();
		 b=new BankB();
		b.getBalance();
		 c=new BankC();
		c.getBalance();
	}
}
 class BankC extends Bank{
	@Override
	public void getBalance()
	{
		System.out.println("Deposite: 200");
	}
}
