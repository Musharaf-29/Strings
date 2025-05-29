import java.util.*;
public class WordCount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String s=sc.nextLine();
	s=s.trim();
	int count=0;
	for(int i=0;i<s.length();i++)
		if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			count++;
	System.out.println("The word Count is:"+count);
	sc.close();
	}

}
