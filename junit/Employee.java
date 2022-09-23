package junit;

public class Employee {
	private int appraisal,salary,yearly;

	public int getAppraisal() {
		return appraisal;
	}

	public void setAppraisal(int appraisal) {
		this.appraisal = appraisal;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int calculateYearlySalary()
	{
		yearly=getSalary()*12;
		return yearly;
	}
	
	
	
	public int calculateAppraisal()
	{
		if(getSalary()>=30000)
		{
			appraisal=calculateYearlySalary()+2000;
			return appraisal;
		}
		 else
		 {
			 appraisal=calculateYearlySalary()+1000;
			return appraisal;
		 }
	}

}
