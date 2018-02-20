package String;

public class Capital {

	public static void main(String[] args)
	{
		String s="maninder kaur";
		String[] s1=s.split(" "); //spaces are removing by spilt
        String s2="";
		String rev="";
		for(int i=0;i<s1.length;i++)
		    {
			for(int j=0;j<s1[i].length();j++)
			{
			if(j==0)
			s2=s2+s1[i].toUpperCase().charAt(0); //capital first letter
			else
			s2=s2+s1[i].charAt(j);
			}
			for(int r=s1.length-1;r>0;r--)
			{
				rev+=s1[i];
			}
			
		}
		System.out.println(s2);
		System.out.println(rev);
		
	}
}

