package Classespack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encapsulaton 
{
 static int idn=1;
 private int id;
 private String name;
 final static String course="java";
 
 InputStreamReader r=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(r);
 
 Encapsulaton()throws IOException
 {
	 //this(10,"his") //calling parameterised
	 id=idn++;
	 
	 System.out.println("enter name");
	 name=br.readLine();
 }
 Encapsulaton(int id,String name)throws IOException
 {
	 //this(); //calling default const
	 //new Student();
	 
	 this.id=id;
	 this.name=name;
 }
  
 public void disp()
 {
	 //System.out.println(this); //current object
	 System.out.println(this.id);
	 System.out.println(this.name);
	 System.out.println(Encapsulaton.course);
 }
 static void connect()
 {
	 System.out.println();
 }
}
class Encapsulation
{
	static
	{
		
	}
		public void main(String[] args) throws IOException
	{
		Encapsulaton s1=new Encapsulaton(); 
		Encapsulaton s2=new Encapsulaton(2,"john"); 
		//System.out.println(s1.id+" "+s1.name+" "+Encapsulaton.course);
		s1.disp();
		s2.disp();
		
		Encapsulaton.connect();
 }

}
