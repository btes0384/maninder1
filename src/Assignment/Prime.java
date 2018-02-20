package Assignment;
import java.util.Scanner;
public class Prime 
{
 public static void main(String[] args) 
	{
	 boolean flag=true;

	 Scanner s=new Scanner (System.in);
	 System.out.println("enter any number");
	 int  n=s.nextInt();
	 for( int i=2;i<n;i++)
	 {
		if(n%i==0)
		{
			flag=true;
		}
	 }
	 if (flag==true)
	 {
		 System.out.println("prime number");
	 }
	 else
		 System.out.println("not prime");
	}
 
 
}
