package junit;

public class SalesPerson {

	private float  sales,salary;

	public float  getSales() {
		return sales;
	}

	public void setSales(float sales) {
		this.sales = sales;
	}


	public float  getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	public float calCommission()
	{
		if(getSales()>=90)
		{
		float a=getSalary()*.2f;
			return a;
		}
		else if(getSalary()>=80)
		{
		float b=getSales()*.1f;
			return b;
		}
		else if(getSalary()>=70)
		{
		float c=getSalary()*.05f;
			return c;
		}
		else
			return 0;
	}
	

}
