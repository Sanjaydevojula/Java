package javapgms;

public class Constructor {
	
	int i ;
	String s;
	
	Constructor (int i , String name){
		this.i= i;
		this.s=name;
	}
	void display() {
		System.out.println(i+ " " +s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor C = new Constructor( 1 , "sanjay");
		C.display();

	}

}
