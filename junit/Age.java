package junit;

public class Age {

	private int age;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean checkAge()
	{
		if(age>=18)           //testCorrect() obj.setAge(18);-->true  //testWrong()  obj.setAge(17);--->false
		return true;
		else
			return false;
	}
}
