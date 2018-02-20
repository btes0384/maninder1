package Assignment;

public class Palindrome {

	public static void main(String[] args) 
	{
		int temp,a=151,r,sum=0;
		
			temp=a;
			while(a>0)
			{
			  r=a%10;
			  sum=(sum*10)+r;
			  a=a/10;
			}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
		
		

	}

}
