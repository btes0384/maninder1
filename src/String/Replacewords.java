package String;

public class Replacewords {

	public static void main(String[] args) 
	{
		String s="city chandigrah";
String[] s1=s.split(" ");
String revstring="";

for(int i=0;i<s1.length;i++)
{
	String s2=s1[i];  // putting words in string s2
	String revword="";
	
	for(int j=s2.length()-1;j>=0;j--)
	{
		revword=revword+s2.charAt(j);
	}
	revstring=revstring+revword+" ";
}
System.out.println(s);
System.out.println("result: "+revstring);
}
}

