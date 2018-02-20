package String;

public class Revwords {

	public static void main(String[] args) 
	{
		String d="";
		String s="hello";
		for(int i=0;i<1;i++)
		{
			System.out.println(s);
		}
		
		String a=new String("bye");
		for( int i=a.length()-1;i>=0;i--)
		{
		  d=d+a.charAt(i);
		}
		System.out.println(d);

	}

}
