package program;

public class Series8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i;
		double i,s=0,c=0;
		System.out.println();
		for(i=1;i<=10;i++)
		{
			c=i/(i+1);
			s=s+c;
			//s=s+(i/(i+1));
			System.out.print(String.format("%.0f", i)+"/"+String.format("%.0f", (i+1)));
			if(i<10)
			{
				System.out.print(" + ");
			}
		}
		System.out.print("="+s);
	}

}
