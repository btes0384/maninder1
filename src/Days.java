import java.util.Scanner;
public class Days {

	public static void main(String[] args)
	{
		int days,months;
		Scanner s=new Scanner ( System.in);
		System.out.println("enter number of days");
		days=s.nextInt();
		
		months=days/30;
		days=days%30;
		
		System.out.println("number of days" +days);
        System.out.println("number of months" +months);
	}

}
