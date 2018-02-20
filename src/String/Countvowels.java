package String;

public class Countvowels {

	public static void main(String[] args)
	{
		int count=0;
		String a="maninder";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				count++;
			}
			
		}
			System.out.println("vowels are = "+count);
		

	}

}
