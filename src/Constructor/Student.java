package Constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student 
{   
	int marks;
	String name;
    static int idn=1;
    int id;
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);

Student()throws IOException
{
	System.out.println("enter name");
	name=br.readLine();
	System.out.println("input marks");
	marks=Integer.parseInt(br.readLine());
	id=idn;
	idn++;
}
Student(String n,int m,int i)  //constructor overloading
{
	name=n;
	marks=m;
	id=i;
}
void display() //Instance method
{
	System.out.println("name="+name);
	System.out.println("marks ="+marks);
	System.out.println("idn ="+id);
	System.out.println();
}
public static void main(String[] args)throws IOException
	{
	Student s1=new Student(); //calling default constructor
	Student s2=new Student("jas",23,2); //calling parameterized constructor
	s1.display();
	s2.display();
	}

}
