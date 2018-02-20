import java.util.Scanner;
public class ScannerSquare {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter side");
		int side=s.nextInt();
		int sqarea=4*side;
		System.out.println("the area of square:" +sqarea);
		
		System.out.print("enter radius");
		int radius=s.nextInt();
        int area=22/7*(radius*radius);
        System.out.println("the area of circle:" +area);

        int circumference=22/7*2*radius;
        System.out.println("the circumference of circle:" +circumference);

			
		}
		

	}


