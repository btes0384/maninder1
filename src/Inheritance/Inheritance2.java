package Inheritance;

public class Inheritance2 {

	public static void main(String[] args) 
	{
		V v1=new R(); //UPCASTING-parent k reference se child ka object bnana but hum only parent k methods call kar skte h , not child's
		v1.disp();
        v1.sum(10, 20);
        // v1.show();   //r's method cannot be accessed
	}

}
class V 
{
	int x;
	V(int a)
	{   
		System.out.println("parent class");
		x=a;
	}
	void disp()
	{
		System.out.println("hello");
	}
	void sum(int p,int q)
	{
		System.out.println(p+q);
	}
}
class R extends V
{
	R()
	{
		super(20);
		System.out.println("child class");
	}
	void show()
	{
		System.out.println(x);
	}
	void sum(int p,int q)
	{   //different implementation code.
		super.sum(p,q); //first call parent class sum method then child class sum
		System.out.println(p*q);
	}
}