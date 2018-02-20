package Assignment;
import java.util.Scanner;
public class Length 
 {
 public static void main(String[] args)
  {
	int n,count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("emter number");
	n=s.nextInt();
	
	while(n>0)
	{
		n=n/10;
		count++;
	}
	System.out.println("length of a number = " +count);
	}

}
