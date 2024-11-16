package javapgms;

public class StringComparision {

	public static void main(String[] args) {
String S1="Sanjay";
String S2="sanjay";
String S3= new String("sanjay");
String S4=new String ("sanjay");

String S5="abc";
String S6=new String("abc");
System.out.println(S1.equals(S2));// used to compare values
System.out.println(S1.equalsIgnoreCase(S2));
System.out.println(S3==S4);// used to compare objects
System.out.println(S5.equals(S6));// used to compare values
System.out.println(S5==S6);// used to compare objects



}

}
