package Classespack;

public class Studentdemo
{
	String name; //data members(instance variables)
    int age;     //data members(instance variables)
    
    final static String course="java";
    
	public static void main(String[] args) 
	{
     System.out.println("enter first student details");
     Studentdemo s1=new Studentdemo(); //creating an object of student 
     System.out.println(Studentdemo.course);
     s1.name ="mani";
     s1.age=23;
     System.out.println(s1.name);
     System.out.println(s1.age);
     System.out.println();
     
     System.out.println("enter second student details");
     Studentdemo s2=new Studentdemo(); //creating an object of student
     System.out.println(Studentdemo.course);
     s2.name="babi";
     s2.age=23;
     System.out.println(s2.name);
     System.out.println(s2.age);
     }
}
