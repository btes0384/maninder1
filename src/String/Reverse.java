package String;

public class Reverse {

	public static void main(String[] args) 
	{
		
		String s="i live in india"; 
		String[] s3=s.split(" ");
		String rev="";
		
		 for( int i=s3.length-1;i>=0;i--)
		  rev+=(s3[i]+" ");

		 System.out.println(rev);
		

	}

}
