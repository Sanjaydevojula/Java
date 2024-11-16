package javapgms;

public class Singlecharoccurance {

	public static void main(String[] args) {
String S="3423fsdfaaaaAAAdsfdasadad,d";
int ab=30;
System.out.println(ab/2);
String S1=S.toLowerCase();
char a='f';
int count=0;
for(int i=0;i<S1.length();i++) {
	if(S1.charAt(i)==a) {
		count++;
	}
}
System.out.println(a+" occured :"+count+"times");
	}

}
