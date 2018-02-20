package Loops;
/*
1
01
101
0101
10101
*/
public class Nested3 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++) //row
		{
			for (int j=i;j>=1;j--) //column
			{
				System.out.print(j%2);
			}
			System.out.println();
		}

	}

}
