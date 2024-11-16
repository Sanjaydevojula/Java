package javapgms;

import java.util.Scanner;

//Event which cause program termination
// checked  found by compiler- interrupted exception,filenot found IO Exception-- can handle by try catch or suggets throws key word to the method
// unchecked- not identified by compiler-Arthemetic, arrayindexoutofbound, Null pointer
// 1 try block can have multiple catch blocks

public class Exceptionhandling {

	public static void main(String[] args) {
		
		try {
			Scanner SC=new Scanner(System.in);
			System.out.println("Enter num");
			int num;
			num=SC.nextInt();
			System.out.println(num);
		System.out.println(100/num);
			
		}catch(Exception e) {  // Exception is parent class of all other exception classes
			System.out.println("Arthemetic exception handled");// executed the catch block
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Finally block is executed"); // it is executed always whether exception is there or not
			
		}
System.out.println("Program completed");
	}

}
/*
String S=null;
S.length();--- Null pointer Exception


int a[]=new int a[5];
a[5] ---- array out of bound execption 


String S="Welcome";

int n=Integer.ParseInt(S)--  number format exception */