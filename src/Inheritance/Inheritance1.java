package Inheritance;

public class Inheritance1 
{
	public static void main(String[] args)
	{
		B b1=new B();
		b1.show();
    }
}

class A
{
	int x;
	A()
	{
		System.out.println("parent class");
		x=20;
	}
}
class B extends A
{
	B()
	{   
		System.out.println("child class");
	}
	void show()
	{
		System.out.println(x);
	}
}