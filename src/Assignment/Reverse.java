package Assignment;
import java.util.Scanner;
public class Reverse
{
   public static void main(String[] args)
	   {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int orgno=s.nextInt();
		int temp=0;
		while(orgno!=0)
	    {
	    	temp=temp*10;
	        temp=temp+orgno%10;
	        orgno=orgno/10;
	    }
	    System.out.println("revrese no="+temp);
	    }
     }
