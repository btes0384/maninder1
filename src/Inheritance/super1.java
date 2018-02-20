package Inheritance;

public class super1
{
public static void main(String[] args) 
	{
C c1=new C();
c1.show();
	}
}

class D
{
	int x;
	D(int a)
	{
		System.out.println("parent class");
		x=a;
	}
}

class C extends D
{
	C()
	{
		super(20); //must be the first statement
		System.out.println("child class");
	}
	void show()
	{
		System.out.println(x);
	}
}
