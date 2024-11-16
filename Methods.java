package javapgms;

public class Methods {
	
	void m1() {
		System.out.println("Hello");
	}
	String m2() {
		return("Hello and How are you");		
	}
	void m3(String name) {
		System.out.println(name);
	}
	
	String m4(String Name) {
		return Name;
		
	}

	public static void main(String[] args) {
		Methods m= new Methods();
		m.m1();
		String S=m.m2();
		System.out.println(S);
		System.out.println(m.m2());
		m.m3(S);
		System.out.println(m.m4("Sanjay"));
		

	}

}
