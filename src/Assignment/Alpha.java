package Assignment;

public class Alpha 
{

	public static void main(String[] args) 
	{
		int a;
		for( int i=1;i<=3;i++) //row
		{ 
			a=97;      //initialize here becoz har row me "a" chahiye
			
			for( int j=3;j>i;j--) //space
			{
				System.out.print(" ");
			}
			for (int k=1;k<=2*i-1;k++) 
			{
				System.out.print((char)a+" ");
				a++;
				}
			System.out.println();
		}
		

	}

}
