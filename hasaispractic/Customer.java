package hasaispractic;

public class Customer extends Person {
	
	float billAmount,quantity,price;
	String prodName;
 public Customer() 
 	{
		super();
		prodName="Moblie";
	}
	public Customer(int id,String name,MyDate dob,float billAmount, float quantity, float price, String prodName) {
		super(id,name,dob);
		this.billAmount = billAmount;
		this.quantity = quantity;
		this.price = price;
		this.prodName = prodName;
	}
	public void calculate()
	{
		billAmount=quantity*price;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Product Name: "+prodName);
	}
}
