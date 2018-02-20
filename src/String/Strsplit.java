package String;

import java.util.Scanner;

public class Strsplit {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine();
		
		System.out.println("enter word");
		String s2=s.nextLine();
	
		String s3[]=s1.split(" ");
		for(int i=0;i<s3.length;i++)
		{
			if(s3[i].equals(s2))
			{
				System.out.print("found");
			}
		}
		

	}

}
