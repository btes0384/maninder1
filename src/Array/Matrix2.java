package Array;
import java.util.Scanner;
public class Matrix2 {

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
System.out.println("enter elements");
int arr[][]=new int[2][3];

for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		arr[i][j]=s.nextInt();
	}
}
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	
	System.out.println();
	}
	}
}
