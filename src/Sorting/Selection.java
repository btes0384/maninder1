package Sorting;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) 
	{ int temp;
		Scanner s=new Scanner(System.in);
		System.out.print("enter elements");
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) //inserting elements
		{
			arr[i]=s.nextInt();
		}
for(int i=0;i<arr.length;i++) //fixing position of i
{
	for(int j=i+1;j<arr.length;j++) //comparison
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
		for(int i=0;i<arr.length;i++) //printing
		{
			System.out.print(arr[i]);
		}
	}
}
