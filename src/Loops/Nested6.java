package Loops;
/*
1
12
123
1235
12357
 */
public class Nested6
{
	public static void main(String[] args) 
	{
		int i,j,k,count;
		
		for(i=1;i<=5;i++)
		{
			count=0;
			for(k=1;k<=i*3;k++)
			{
				boolean isPrime=true;
				
				for(j=2;j<k;j++)
				{
					if(k%j==0)
					{
						isPrime=false;
						
						break;
					}
				}
					if((isPrime==true)&&(count<i))
					{
						System.out.print(k);
						count++;
					}
				}
				System.out.println();
			}
		}

	}

