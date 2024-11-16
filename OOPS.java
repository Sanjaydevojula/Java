package javapgms;

public class OOPS {
	int n;
	String s;
	
	void print() {
		System.out.println(n);
		System.out.println(s);
		System.out.println("this is class");
		}
	
	public static void main(String[] args) {
		OOPS ob= new OOPS();
		ob.n=50;
		ob.s="Sanjay";
		ob.print();

	}

}
