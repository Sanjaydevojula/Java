package javapgms;

public class PrimeandrevNo {

	public static void main(String[] args) {
int a=10,count=0;

for(int i=1;i<=a;i++) {
	if(a%i==0)
	{
		count++;
	}
}
if(count==2) {
	System.out.println("a is prime");
}
	else {
		System.out.println("a is not prime");
	}

}
	}

