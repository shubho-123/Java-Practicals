package hasaispractic;

public class SalesPerson extends EmplyeeIsA {
	int sales;
	float commission;
	public SalesPerson()
	{
		super();
	}
	public SalesPerson(int id,String name,MyDate dob,Address add,float workingDay,float workPer,int sales) {
		super(id,name,dob,add,workingDay,workPer);
		this.sales = sales;
		//this.commission = commission;
	}
	@Override
	public void display()
	{
		
		super.display();
		System.out.println("Sales: "+sales);
		System.out.println("Commission: "+commission);
		System.out.println("Gross Salary: "+(commission+salary));
	}
	@Override
	public void calculate()
	{
		super.calculate();

		if(sales>=95)
		{
			commission=0.2f*salary;
			
		}
		else if(sales>=90 && sales<95)																
		{
			commission=0.15f*salary;
			//System.out.println("Gross Salary: "+(commission+salary));
		}
		else if(sales>=80 && sales<90)
		{
			commission=0.1f*salary;
			//System.out.println("Gross Salary: "+(commission+salary));
		}
		else if(sales>=75 && sales<80)
		{
			commission=0.05f*salary;
			//System.out.println("Gross Salary: "+(commission+salary));
		}
		else
			commission=0;
		//System.out.println("Gross Salary: "+salary);
		
	
	}

}
