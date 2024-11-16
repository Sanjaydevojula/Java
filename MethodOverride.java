package javapgms;

class MOparent{
	void display() {
		System.out.println("Print Parent");
	}
	
}

class MOchild extends MOparent {
	void display() { // same method with same signature but body or implementation is diff is overriding
		System.out.println("Print Child");
	}

}




public class MethodOverride {

	public static void main(String[] args) {

		MOchild MO= new MOchild();
		MO.display();

	}

}
