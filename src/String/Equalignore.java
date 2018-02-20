package String;

public class Equalignore {

	public static void main(String[] args) 
	{
		String s="hello";
		String s1=new String("HELLO");
		
		if(s.equalsIgnoreCase(s1)) //equalsIgnoreCase matches capital & small letters ASCII values
			System.out.println("same");
		else
			System.out.println("not");


	}

}
