package javapgms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int fact=1;
     int n=sc.nextInt();
     System.out.println("Enter  No"+n);
     for(int i=1;i<=n;i++) {
    	fact =fact*i;
     }
    	System.out.println("Factorial is:"+fact);

	}

}
