package String;

public class Trim {

	public static void main(String[] args) 
	{
		String s1="             how r u";
		System.out.println("string before triming = "+s1);
		System.out.println("string after triming = "+s1.trim());  //trim() is used to remove white spaces
		
		String s2=new String("I m fine !!");
		System.out.println("hashcode of i m fine = "+s2.hashCode()); //hashCode shows string in code format

	}

}
