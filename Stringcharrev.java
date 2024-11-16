package javapgms;

public class Stringcharrev {

	public static void main(String[] args) {
String S="This is String";
String rev1="";
System.out.println(S.length());
String S1[]=S.split("\\s");
//System.out.println(S1[2]);
for(String  S2:S1){
	String rev2="";
	for(int i=S2.length()-1;i>=0;i-- ) {
		rev2=rev2+S2.charAt(i)+" ";
	}
	 rev1=rev1+rev2+" ";
	
}
System.out.println(rev1);
}
}



