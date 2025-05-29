import java.util.*;

public class SentenceWordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		s=s.trim();
		String b[]=s.split("\\s+");
		System.out.println("The word Count is:"+b.length);
		sc.close();
		}
}
