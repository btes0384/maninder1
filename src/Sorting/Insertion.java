package Sorting;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args)
	{int temp;
		Scanner s=new Scanner(System.in);
		System.out.print("enter elements");
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			for(int j=i;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					temp=arr[j];
					arr[i]=arr[j-1];
					arr[j-1]=temp;
					}
				}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}



