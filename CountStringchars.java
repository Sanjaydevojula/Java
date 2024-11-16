package javapgms;

import java.util.Scanner;

public class CountStringchars {
	public static void main(String args[]) {
		String S= "This is Sanjay String";
		String A=S.replaceAll("\\s","");
		System.out.println(A);
		int count=1;
		char C[]=A.toCharArray();
		
	for (int i=0;i<=C.length-1;i++) {		
		for(int j=i+1;j<=C.length-1;j++) {
			if(C[i]==C[j]) {
				count++;	
				C[j]='0';
	}
		}

		if(count>=1 && C[i]!='0') {
		System.out.println(C[i] +" is repeated" +count+ " times");
		}
		count=1;

	}
	}
	}
	

