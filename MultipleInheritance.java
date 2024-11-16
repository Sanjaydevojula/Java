package javapgms;

interface I1{
	int a=20;
	void m();
}

interface I2{
	
	int b=20;
	void m();
}
public class MultipleInheritance implements I1,I2 {
	
	public void m() {
		System.out.println("this is m");
		
	}

	public static void main(String[] args) {
		MultipleInheritance mh=new MultipleInheritance();
		mh.m();

	}

}