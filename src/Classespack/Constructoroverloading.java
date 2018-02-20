package Classespack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Constructoroverloading 
{  
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	
	Constructoroverloading() throws IOException
	{
	 System.out.println("enter side");
	 int side=Integer.parseInt(br.readLine());
	 
	int sqarea=4*side;
	 System.out.println("area of square = "+sqarea);
	 
	int sqperimeter=side*side*side;
	 System.out.println("perimeter of square = "+sqperimeter);
	 
	 System.out.println();
	}
Constructoroverloading(int radius)throws IOException
{
	System.out.println("enter radius");
	radius=Integer.parseInt(br.readLine());
	
	int cirarea=2*22/7*radius*radius;
	System.out.println("area of circle = "+cirarea);
	
	int cirperimeter=2*22/7*radius;
	System.out.println("perimeter of circle = "+cirperimeter);
	
	System.out.println();
}
Constructoroverloading(int l,int b)throws IOException
{
	System.out.println("enter length");
	l=Integer.parseInt(br.readLine());
	System.out.println("enter breath");
    b=Integer.parseInt(br.readLine());
    
    int recarea=l*b;
    System.out.println("area of rectangle = "+recarea);
    
    int recperimeter=2*(l+b);
    System.out.println("perimeter of rectangle = "+recperimeter);
}
  
public static void main(String[] args) throws IOException
	{
		Constructoroverloading f1=new Constructoroverloading();
		Constructoroverloading f2=new Constructoroverloading(3);
		Constructoroverloading f3=new Constructoroverloading(4,5);
	}

	
}

