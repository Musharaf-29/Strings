import java.util.Scanner;

public class ReverseOfString1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		String output=" ";
		for(int i=s.length()-1;i>=0;i--)
			output=output+s.charAt(i);
		System.out.println("The Reverse Of Input String is :"+output);
		sc.close();
		}
}
