package String;

public class Capital1
{
   public static void main(String[] args)
	{
		String s="my name is mani";
		String s1[]=s.split(" ");
		char c;
		String s2="";
		
		for(int i=0;i<s1.length;i++)
		{
			c=s1[i].charAt(0);
			c=Character.toUpperCase(c);
			s2=s2+s1[i].replace(s1[i].charAt(0),c);
			s2=s2+" ";
		}
     System.out.println(s2);
	}

}
