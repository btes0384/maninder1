package Assignment;
import java.util.Scanner;
public class Saramstrong {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n,temp,a,c=0;
		System.out.println("enter any number");
		n=s.nextInt();
	    temp=n;
	    while(n>0)
	    {
	    	a=n%10;
	    	c=c+(a*a*a);
	    	n=n/10;
	    }
if(c==temp)
{
	System.out.println("aramstrong");
}
else
{
	System.out.println("not");
}
	}

}
