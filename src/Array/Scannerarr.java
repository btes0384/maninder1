package Array;
import java.util.Scanner;
public class Scannerarr {

	public static void main(String[] args) 
	{ 
		int n=10;
		Scanner s=new Scanner(System.in);
		System.out.print("enter elements of array");
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
