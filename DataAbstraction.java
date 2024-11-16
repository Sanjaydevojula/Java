package javapgms;

interface Shape{
	int a=10;
	int b=20; //  variables are static and final by default
	
	void circle();  // abstract method no implementation  default methods are public in interface
	
	default void square() {    // default and static methods also available from java 8 in interfaces
		System.out.println("this is default");
	}
	
	static void rectangle() {
         System.out.println("this is default");
	}
	
	
}

public class DataAbstraction implements Shape

{
	public void circle() {
		System.out.println("This is circle abstract method");
	}
	
	void triangle() {
		System.out.println("this is triangle");
	}

	public static void main(String[] args) {
		
		Shape S= new DataAbstraction();  // interface can create only object referance variable (S) but not object as new
        S.circle();
        S.square();
        Shape.rectangle();// interface name . static method as static method in interface if it is in class can directly accessible
	System.out.println(Shape.a+Shape.b);
	// S.triangle(); cannot access bcz it belongs to class not to interface and can be access from class object
	}

}
