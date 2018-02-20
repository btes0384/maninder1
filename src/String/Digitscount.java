package String;

public class Digitscount {

	public static void main(String[] args) 
	{

		int vowel=0,consonts=0,spaces=0,digits=0;
		String a="maninder kaur 76";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'|| a.charAt(i)=='e'|| a.charAt(i)=='i'|| a.charAt(i)=='o'|| a.charAt(i)=='u')
			{
			vowel++;
			}
			else if (a.charAt(i)>='a'&& a.charAt(i)<='z')
			{
		    consonts++;
			}
			else if(a.charAt(i)>='0'&& a.charAt(i)<='9')
			{
				digits++;
			}
				else if(a.charAt(i)==' ')
			{
				spaces++;
			}
			
		}
			System.out.println("vowels = " +vowel);
			System.out.println("consonts = " +consonts);
			System.out.println("spaces = " +spaces);
			System.out.println("digits = "+digits);


	}

}
