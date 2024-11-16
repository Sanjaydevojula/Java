package javapgms;

class parent{
	int i=100;
	void display1() {
		System.out.println("this is parent");
	}
}
class child extends parent{
	int j=200;
	void display2() {
		System.out.println("This is child");
	}
}

public class Typecatingobjects {

	public static void main(String[] args) {
		child c= new child();
	System.out.println(c.i);
	System.out.println(c.j);
	c.display1();
	c.display2();
	
	parent p= new child();// parent class reference variable can hold  child object  
         // upcasting as parent is higher and stoing in higher variable
		System.out.println(p.i);
		p.display1();  //can access parent data but not child data
		
		parent p1= new parent();	
		child c1=(child) p1;// downcasting lower child is storing higher parent so casting explicitly
		System.out.println(c1.i);
		System.out.println(c1.j);
		c1.display1();
		c1.display2();  // gets run time exception
	}

}
