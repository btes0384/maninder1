package Array;
import java.util.Scanner;
public class Maximum {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.print("enter numbers");
	int[] arr=new int[5];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	
     int max=arr[0];
     for(int i=1;i<arr.length;i++)
    	 max=arr[i];
	
    System.out.println("largest number=" +max);
  }

}
