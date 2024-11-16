package javapgms;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
String S="  #$43q34q(*)* Sanjay   ";
String B="abc,123@xyz";
String S2="Sanjay";
String S1=S.replaceAll("[^a-zA-Z0-9]", "");// replaces special chars
S=S.trim();// removes spaces
System.out.println(S.charAt(9));// char at index
String A[]=S.split(" ");// split method splits into string array
System.out.println(S1);
System.out.println(S);
System.out.println(S.substring(5));
System.out.println(S2.substring(1,4));// frst index includes scnd indx excluded
System.out.println(S2.toLowerCase());
System.out.println(S2.toUpperCase());
System.out.println(S2.toCharArray()); 
System.out.println(A[0]);
String b[]=B.split(",");
System.out.println(Arrays.toString(b));// print values in array
System.out.println(b[0]);
String c[]=b[1].split("@");
System.out.println(Arrays.toString(c));
System.out.println(B.split(",")[0]);
System.out.println(B.split(",")[1].split("@")[0]);
System.out.println(B.split(",")[1].split("@")[1]);

	}

}
