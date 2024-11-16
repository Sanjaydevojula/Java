package javapgms;
import java.util.*;

public class StarPattern {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter No");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
	for(int j=i+1;j>0;j--) {
		System.out.print("*");
		System.out.print(" ");
	}
	System.out.println();

}
	}

}
