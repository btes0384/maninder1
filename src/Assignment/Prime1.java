package Assignment;

public class Prime1 {

	public static void main(String[] args) 
	{ 
		boolean flag;
		for(int i=1;i<=100;i++)
		{
			flag=true;
			for(int n=2;n<=i/2;n++) //number divide  by 2 becz if half no.will divide then no need to go through no.
			{
				if(i%n==0)
				{
					flag=false; //if number is not prime
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(i);
			}
				
				
			}
		}
	

	}

