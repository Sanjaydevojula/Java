package javapgms;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  n, f=1;
Scanner in = new Scanner(System.in);
System.out.println("ENTER nO");

n=in.nextInt();

for( int c= 1; c<=n;c++) {
	f=c*f;
}
	System.out.println("factorial:" +f);


	}

}




