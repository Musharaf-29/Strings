import java.util.*;
public class GreatestWordlength {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the String:");
	String input=sc.nextLine();
	String []s=input.split(" ");
	String output="";
	/*for(int i=0;i<s.length;i++) {
		if(s[i].length()>output.length()) {
			output=s[i];
		}
	}*/
	for(String name:s) {
		if(name.length()>output.length()) {
			output=name;
		}
	}
	System.out.println("The Greatest Word is:"+output);
	sc.close();
	}

}
