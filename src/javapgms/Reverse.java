package javapgms;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=123,rev=0;
while(a>0) {
	rev=rev*10;
	rev=rev+a%10;
	a=a/10;
	
}
System.out.println(rev);
	}

}
