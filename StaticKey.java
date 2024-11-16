package javapgms;

public class StaticKey {	
	// if variables are same across objects then make them static
	//static methods can access static stuff directly and No Object is required
	//static methods cannot  access Non static stuff directly and No Object is required
//static method can access static stuff from other class(Outside of class ) with class name
	
	/*
class System{
static PrintStream out

System.out.println()// println is a method , system is predefined class  out is print stream  variable
}
	 */

	static int a=10; 
	int b=20; // Non Static

	static void m1() 
	{
		System.out.println("this is static");
	}

	void m2() // Non Static Methods
	{
		System.out.println("This is non Static");

	}
	
	void m() // Non Static can access static and Non Static directly
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
}
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		StaticKey sk= new StaticKey();

		//System.out.println(b);// cannot access b as it is not static 
		//	m2(); // cannot access m2 as is not static
		System.out.println(sk.b);//  Static methods can access non static (b)  through object
		sk.m2();
		sk.m();



	}

}
