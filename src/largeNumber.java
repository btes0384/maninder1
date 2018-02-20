import java.util.Scanner;
public class largeNumber {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of a");
		a = s.nextInt();
		System.out.println("enter value of b");
        b =s.nextInt();
		System.out.println("enter value of c");
        c =s.nextInt();
		
	String great;
	
	great =	(a>b)&&(a>c)?"a is greater":(b>a)&&(b>c)?"b is greater":"c is greater";
		

    System.out.println(great);

	}
}
