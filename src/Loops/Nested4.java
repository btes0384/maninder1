package Loops;
/*
  *
 ***
*****
 ***
  *
 */
public class Nested4 {

	public static void main(String[] args) 
	{
		int i,j,k,c;
		for(i=1;i<=3;i++) //row
		{
			for(j=3;j>i;j--) //space
			{
				System.out.print(" ");
			}
			    for(k=1;k<=2*i-1;k++) //print
			    {
				   System.out.print("*");
			    }
			        System.out.println();
		      }
		
		for(i=2;i>=1;i--) //row
		{
			for(j=2;j>=i;j--) //space
			{
				System.out.print(" ");
			}
		
		 for(k=1;k<=2*i-1;k++)
		    {
			   System.out.print("*");
		    }
		
		System.out.println();
		}
	}
}


