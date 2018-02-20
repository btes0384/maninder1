package Inheritance;

public class Inheritance3 {

	public static void main(String[] args) 
	{
	S s1=new S();
	s1.show();

	}
}

class W
{ 
	int x;
	W(int a)
	{
		System.out.println("parent class");
		x=a;
	}
	void disp()
	{
		System.out.println("hello");
	}
}
class S extends W
{
	int x;
	S()
	{
		super(20);// passing value in super class variable a.
		x=60;
		System.out.println("child class");
	}
	void show()
	{
		System.out.println(super.x); // CALL parent class method by super.methodname when both classes same variable name.
		System.out.println(x); //base class
	}
}