package String;

public class Intern1 {

	public static void main(String[] args) 
	{
		String s1="beautiful city";
		String s2=new String("beautiful city").intern(); //intern() is used for getting string from the memory
		System.out.println(s1==s2);
	}

}
