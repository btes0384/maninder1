package String;

public class Indexof {

	public static void main(String[] args) 
	{
	 String s1="hello world , hello reader";
int index=s1.indexOf("hello");

if(index==-1) //index==-1 if string is empty
{
	System.out.println("not found");
}
else
{
	System.out.println("Index is at " +index);
}
	}

}
