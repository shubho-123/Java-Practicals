package hasaispractic;

import java.util.Scanner;

public class IndividualFactorials {

	public static void main(String[] args) {
		
		   int n, r = 0,i,fact=1,j=0,k;
		   
		   
//		   int count=0;
		   
		    Scanner sc = new Scanner (System.in);
		    System.out.println("Enter a Number: ");
		      n = sc.nextInt ();
		      int a[]=new int[5];
		    if (n > 32767)
		        System.out.println ("Number is too Large");
		    else if (n<=32767 &&   n>0)
		      {
		    	
			while (n != 0)
			  {
			    r = n % 10;
			    n = n / 10;
			    for(i=1;i<=r;i++)
			    {
			        fact=fact*i;
			        
			    }
		
			    a[j]=fact;
			     fact=1;
			   j++;
			   	 
			    
			  }
			for(k=j-1;k>=0;k--)
			{
				System.out.println(a[k]);
			}
			


		      }
		      else if(n==0)
		      System.out.println("0");
		    else
		        System.out.println ("Number is too small");
	}

}
