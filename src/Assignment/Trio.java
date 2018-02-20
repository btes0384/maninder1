package Assignment;

public class Trio {

	public static void main(String[] args) 
	{
		int a=0,b=1,c=2,i,d;
		System.out.print(a+ " " +b);
		
		for(i=4;i<10;i++)
		{
			d=a+b+c;
			System.out.print(" "+d);
			a=b;
			b=c;
			c=d;
		    
		}

	}

}
