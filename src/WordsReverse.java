import java.util.*;
public class WordsReverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String m=sc.nextLine();
		String []n=m.split(" ");
		String s=" ";
		for(int i=0;i<n.length;i++) {
			for(int j=n[i].length()-1;j>=0;j--) {
				s=s+n[i].charAt(j);
			}
			s=s+" ";
		}
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
		
		sc.close();
	}
}
