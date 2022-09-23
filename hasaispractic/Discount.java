package hasaispractic;

public class Discount extends Customer{
	float disc;

	public Discount()
	{
		super();
		
	}
	public Discount(int id,String name,MyDate dob,float billAmount, float quantity, float price, String prodName)
	{
		super(id,name,dob,billAmount,quantity,price,prodName);
	}
	public void calculate()
	{
		super.calculate();
		if(billAmount>=20000)
			disc=1.5f*billAmount;
		else if(15000>=billAmount && billAmount<20000)
			disc=0.1f*billAmount;
		else if(billAmount>=10000 && billAmount<15000)
			disc=0.7f*billAmount;
		else if(billAmount<10000)
			disc=0;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("Final Bill: "+(billAmount-disc));
	}
	

}
