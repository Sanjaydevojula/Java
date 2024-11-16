package javapgms;

public class StringRev {

	public static void main(String[] args) {
String S1="I am String";
String S2[]=S1.split("\\s");
String rev="";
System.out.println(S2.length);
for(int i=S2.length-1;i>=0;i--) {
	System.out.print(rev+S2[i]+" ");
	}
	
}
}

