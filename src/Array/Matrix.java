package Array;
import java.util.Scanner;
/*
  show matrix of 3*2
*/

public class Matrix 
{
	public static void main(String[] args)
	{  
		int[][] arr=new int[3][2];

Scanner s=new Scanner(System.in);
System.out.println("matrix is " +" ");
System.out.print("enter elements");
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
	 arr[i][j]=s.nextInt();
	}
}
System.out.print("the matrix is");
		
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
     System.out.println();

	}
}
}
