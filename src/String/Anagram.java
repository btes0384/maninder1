package String;

public class Anagram {

	public static void main(String[] args) 
	{
String s="moone"; //listen //ten-net
String s1="silent";

boolean flag=false;

if(s.length()==s1.length())
{ 
for(int i=0;i<s.length();i++)
{
	for(int j=0;j<s1.length();j++)
	 {
		if(s.charAt(i)==s1.charAt(j))
		{
			flag=true;
			break;
		}
		else
		{
			flag=false;
		}
	}
	if(flag==false)
		break;
   }
}
if(flag==true)
{
	System.out.println("Annagram");
}
else
{
	System.out.println("Not a Annagram");
}
	}
	
}
