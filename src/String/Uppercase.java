package String;
/*
enter string
hello DEAR
enter word
dear
true
 */
import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine().toUpperCase();
		
		System.out.println("enter word");
		String s2=s.nextLine().toUpperCase();
		
		if(s1.contains(s2))
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		

	}

}
