package javapgms;

class Animal {
	String color="white";

	void eat() {
		System.out.println("Eat");
	}
public Animal(){
	System.out.println("animal");
}
}


class dog extends Animal{
	String color= "black";
	void display() {
		System.out.println(super.color); // invoke parent class variable
		// super key word is used to invoke immediate parent class variable
	}
	void eat() {
		super.eat();// invoke immediate parent class method 
		System.out.println("Eatoing child");
	}
	dog(){
		super(); // invoke parent class constructor super is optional for parent constructor
		System.out.println("dog");
	}

}


public class SuperKey {
	public static  void main(String[] args) {
		dog d= new dog();
		//d.display();
		//d.eat();

	}


}
