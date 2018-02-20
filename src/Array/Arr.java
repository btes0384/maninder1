package Array;
// To print elements of array = 12345678910
public class Arr {

	public static void main(String[] args)
	{ 
		int[] arr=new int[10];
		System.out.print("Elements of array = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
