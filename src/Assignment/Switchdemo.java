package Assignment;
import java.util.Scanner;
public class Switchdemo 
{
  public static void main(String[] args) 
	{   
		int weekday;
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		weekday=s.nextInt();
		switch(weekday)
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
		System.out.println("wednesday");
		break;
		case 4:
			System.out.println("thrusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default :
			System.out.println("invalid"); 
			}
	}

}
