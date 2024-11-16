package javapgms;

public class NewStringrev {

	public static void main(String[] args) {
String S="Sanjay Sindhu";

for(int i=S.length()-1;i>=0;i--) {
	System.out.print(S.charAt(i));
	}
System.out.println();
char c[]=S.toCharArray();
for(int i = c.length-1;i>=0;i--) {
	System.out.print(c[i]);
}
System.out.println();
StringBuffer s=new StringBuffer("Sanjay");
System.out.println(s.reverse());
StringBuilder s1=new StringBuilder("Sanjay");
System.out.println(s1.reverse());


}
	}


