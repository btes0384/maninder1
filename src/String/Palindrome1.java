package String;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) 
	{
		String org,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		org=s.nextLine();
		
		int length=org.length();
		
		for(int i=length-1;i>=0;i--)
		rev = rev + org.charAt(i);

		if(org.equals(rev))
		System.out.println(org+ " is palindrome");
		
		else
	    System.out.println(org+ " is not");
	}
	
}
