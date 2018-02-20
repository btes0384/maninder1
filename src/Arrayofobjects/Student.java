package Arrayofobjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student 
{
	int rollno;
	String name;
	char grade;
	double eng_marks,math_marks,sci_marks,total_marks,average;
	
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
    
	Student()throws IOException
	{
		System.out.println("enter rollno");
		rollno=Integer.parseInt(br.readLine());
		System.out.println("enter name");
		name=br.readLine();
		System.out.println("enter eng_marks");
		eng_marks=Integer.parseInt(br.readLine());
		System.out.println("enter math_marks");
		math_marks=Integer.parseInt(br.readLine());
		System.out.println("enter sci_marks");
		sci_marks=Integer.parseInt(br.readLine());
		System.out.println();
	}
	void cal_total()
	{
		total_marks=eng_marks+math_marks+sci_marks;
		System.out.println("total marks="+total_marks);
		cal_average();
		find_grade();
	}
	void cal_average()
	{
		average=(total_marks/3);
		System.out.println("average is"+average);
	}
    void find_grade()
   {
	if(average>80)
		System.out.println("excellent");
	else if(average>60)
		System.out.println("good");
	else if(average>50)
		System.out.println("average");
	else
		System.out.println("fail");
	}
    public String toString()
    {
    	return("hello");
    }
    public boolean equals()
    {
    	return(false);
    }
    public int hashcode()
    {
    	return(34);
    } 
    
    
	public static void main(String[] args) throws IOException
	{
		Student s[]=new Student[5];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student(); //calling constructor student
		    s[i].cal_total();
		    System.out.println(s[i].toString()); //packagename.classname.hashvalue
		    System.out.println(s[i].equals(s[i+1])); //false because 2nd objects's place in memory will be different
		    System.out.println(s[i].hashCode()); //print values in code form
		}
	}

}
