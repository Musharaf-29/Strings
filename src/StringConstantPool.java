class StringConstantPool {
	public static void main(String[] args) {
	String s1=new String("Kuppam");
	s1.concat("Engineering");
	String s2=s1.concat("College");
	s1=s1.concat("Kuppam");
	System.out.println(s1);
	System.out.println(s2);
	
	String s11=new String("Spring");
	s11.concat("Summer");
	String s22=s11.concat("Winter");
	s11=s11.concat("Fall");
	System.out.println(s11);
	System.out.println(s22);
	
	String s3=new String("KEC");
	String s4=new String("KEC");
	String s5="KEC";
	String s6="KEC";
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
	
	String s7=new String("Hello");
	s7.concat("World");
	System.out.println(s7);
	StringBuffer sb=new StringBuffer("Hello");
	sb.append(" World");
	System.out.println(sb);
	
	String s8=new String("Hello");
	String s9=new String("Hello");
	System.out.println(s8==s9);
	System.out.println(s8.equals(s9));
	
	StringBuffer s88=new StringBuffer("Hello");
	StringBuffer s99=new StringBuffer("Hello");
	System.out.println(s88==s99);
	System.out.println(s88.equals(s99));
	
	
	}

}
