package javapgms;



	class C1{  // parent, base,super

	void display() {
		System.out.println("Parent class");
	}
	}
	
	class C2 extends C1{ // child, derived,sub
	
		 void display2() {
			System.out.println("Child class");
		}
		
	}	
public class Inheritance {

	public static void main(String[] args) { // main is static because it is directly called by JVM and String args is string array
		
		C2 cobj2= new C2();
		cobj2.display();
		cobj2.display2();
		
	}
		
	}

		
		


