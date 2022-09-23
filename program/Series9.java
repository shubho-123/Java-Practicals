package program;

public class Series9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i,s=0;
		System.out.println();
		for(i=1;i<=15;i++)
		{
			s=s+(i*(i+1));
			System.out.print(i+"*"+(i+1));
			if(i<=14)
			{
				System.out.print(" + ");
				System.out.println("="+s);
			}
		}
		System.out.println("="+s);
	}

}
