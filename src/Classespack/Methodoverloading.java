package Classespack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methodoverloading 
{
public void area(int s)
{
	System.out.println("AREA OF SQUARE");
   int square=4*s;
    System.out.println("area is "+square);
    System.out.println();
}
 public void area(float radius)
{
	System.out.println("AREA OF CIRCLE");
	float cirarea=22/7*radius*radius;
	System.out.println("area is "+cirarea);
	System.out.println();
} 
public void area(int a,int b)
{
	System.out.println("AREA OF RECTANGLE");
	int recarea=a*b;
	System.out.println("area is "+recarea);
	System.out.println();
}
public void peri(int s)
{
	System.out.println("PERIMETER OF SQUARE");
   int sqperi=s*s*s;
    System.out.println("perimeter is "+sqperi);
    System.out.println();
}
public void peri(float radius)
{
	System.out.println("PERIMETER OF CIRCLE");
  float cirperi=2*22/7*radius;
    System.out.println("perimeter is "+cirperi);
    System.out.println();
}
public void peri(int a,int b)
{
	System.out.println("PERIMETER OF RECTANGLE");
   int recperi=2*(a+b);
    System.out.println("perimeter is "+recperi);
    System.out.println();
}


	public static void main(String[] args) throws IOException
	{
		Methodoverloading f1=new Methodoverloading();
		f1.area(2);
		f1.area(4,8);
		f1.area(15f);
		f1.peri(3);
		f1.peri(5f);
		f1.peri(7,8);
		
	}

	}
