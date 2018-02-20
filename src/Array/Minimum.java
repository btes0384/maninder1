package Array;
import java.util.Scanner;
public class Minimum {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter elements");
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int min=arr[0];
	    for(int i=1;i>arr.length;i++)
		min=arr[i];
		
		System.out.println("minimum value ="+min);
		
	}

}
