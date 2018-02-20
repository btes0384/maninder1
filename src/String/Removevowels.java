package String;
import java.util.Scanner;
public class Removevowels {

	public static void main(String[] args)
	{ 
		String strorg,strnew;
		Scanner s=new Scanner(System.in);
	System.out.println("enter any string");
    strorg=s.nextLine();
    
    System.out.println("removing vowels");
    strnew=strorg.replaceAll("[aieouAIEOU]","");
    
    System.out.println("all vowels are removed");
	System.out.println(strnew);

	}

}
