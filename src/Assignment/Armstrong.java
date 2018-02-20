package Assignment;

public class Armstrong {

	public static void main(String[] args) 
	{
    int n=153,temp,a,c=0;
    temp=n;
    while(n>0)
    {
    	a=n%10;
    	c=c+(a*a*a);
    	n=n/10;
    }
    if(temp==c)
    {
    System.out.println("aramstrong number");
	}
    else
    {
    	System.out.println("not");
    }
  }
}