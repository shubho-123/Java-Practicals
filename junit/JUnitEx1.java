package junit;

public class JUnitEx1 {
	
	public int square(int a)
	{
		return a*a;
	}
	
	public int countA(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='a' || str.charAt(i)=='A' )
		count++;
		}
		return count;
	}
}
