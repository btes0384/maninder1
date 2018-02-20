package Abstractdemo;

abstract class Figure
{
	abstract void farea();
	abstract void fperimeter();
	double area;
	double perimeter;
}

class Rectangle extends Figure
{
	double w=5,l=6;
	void farea()
	{
		area=(w*l);
		System.out.println("area of recangle = "+area);
	}
	void fperimeter()
	{
		perimeter=(2*(w+l));
		System.out.println("perimeter of rectangle = "+perimeter);
	}
	public String toString()
	{
		return("hello");
	}
}
class Triangle extends Figure
{
	double b=8,h=4,a=3;
	void farea()
	{
		area=(b*h)/2;
		System.out.println("area of triangle "+area);
	}
	void fperimeter()
	{
		perimeter=a*b*h;
		System.out.println("perimeter of triangle "+perimeter);
	}
	public String toString()
	{
		return("hi");
	}
}

class Circle extends Figure
{
		double r=8;
	void farea()
	{
		area=(22/7*r*r);
		System.out.println("area of circle "+area);
	}
	void fperimeter()
	{
		perimeter=(2*22/7*r);
		System.out.println("perimeter of circle "+perimeter);
	}
	public String toString()
	{
		return("guys");
	}
}
	
	public class Shape
	{
    public static void main(String[] args) 
	{
    	Figure f1[]=new Figure[6];
    	for(int i=0;i<f1.length;i++)
    	{
    		if(i<2)
    		{
       f1[i]=new Rectangle();
       f1[i].farea();
       f1[i].fperimeter();
    		}
    		else if(i>2&&i<4)
    		{
    			f1[i]=new Circle();
    			f1[i].farea();
    		    f1[i].fperimeter();
    		}
    		else
    		{
    			f1[i]=new Triangle();
    			f1[i].farea();
 		        f1[i].fperimeter();
    		 }
    		System.out.println(f1[i].toString());
		    }
    	}
	}


