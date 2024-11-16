package javapgms;

public class Revno {

	public static void main(String[] args) {
		int rev=0,c=0,b=2343;
		while(b>0) 
		{
		c=b%10;
		rev=rev*10+c;
		b=b/10;
		}
		System.out.println(rev);

	}

}
