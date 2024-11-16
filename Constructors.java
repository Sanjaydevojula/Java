package javapgms;

public class Constructors {
	int id; // class or instance variables
	String name;
	char grade;
	
	Constructors(){// never return value not metioned void 
		System.out.println("hello");
	}
	Constructors(int id, String name,char grade){ // local variables
		this.id=id;   // this.id is class variable and id is local variables
		this.name=name;
		this.grade=grade;	
		
	}
	void display() {
		System.out.println(id+" "+name+" "+grade);
	}
	
	
	

	public static void main(String[] args) {
		Constructors c=new Constructors(); //constructor invoked at object creation
		// cannot invoke multiple constructors
		Constructors c1=new Constructors(100,"S",'A');
		
		c1.display();
		

	}

}
