package Assignment;

public class Alpha1 {

	public static void main(String[] args) 
	{
		int a,k;
		for( int i=1;i<=3;i++) //row
		{ 
			a=97;      //intialize here becoz har row me "a" chahiye
			
			for( int j=3;j>i;j--) //space
			{
				System.out.print(" ");
			}
			for ( k=1;k<=i;k++) 
			{
				System.out.print((char)a);
				a++;
			}
			a=a-2;
			for( k=2;k<=i;k++)
			{	
				System.out.print((char)a);
				a--;
			}
			System.out.println();
		}
		for( int i=3;i>=1;i--) //row
		{ 
		  a=97;     //intialize here becoz har row me "a" chahiye
			
			for(int j=3;j>=i;j--) //space
			{
				System.out.print(" ");
			}
			for(k=2;k<=i;k++)
			{ 
               System.out.print((char)a);
                a++;
	         }
			a=a-2;
			for( k=2;k<=i;k++)
			{	
				System.out.print((char)a);
				a--;
			}
			System.out.println();
		}
	}

		 
	   }

