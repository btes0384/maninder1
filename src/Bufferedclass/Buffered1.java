package Bufferedclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered1 {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader r=new InputStreamReader(System.in); 
        BufferedReader br=new BufferedReader(r);
        
        System.out.println("enter name");
        String name= br.readLine();    
        System.out.println("name = "+name);
        
        System.out.println("enter number");
        int n=Integer.parseInt(br.readLine());
        System.out.println("number = "+n);
        
	}

}
