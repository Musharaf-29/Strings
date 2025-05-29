
public class StartingLetterUppCase {

	public static void main(String[] args) {
		String input="hello gOOD morNing";
		String output=" ";
		String finaloutput=" ";
		String caps=" ";
		String lower=" ";
		String arr[]=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			caps=arr[i].substring(0, 1);
			lower=arr[i].substring(1);
			caps=caps.toUpperCase();
			lower=lower.toLowerCase();
			output=caps+lower;
			finaloutput+=output+" ";
		}
	System.out.println(finaloutput);
	
	}

}
