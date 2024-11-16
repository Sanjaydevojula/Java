package javapgms;

public class ThrowException {
	
	void sum(int num) {
		if(num<1) {
			throw new ArithmeticException("num cant be zero"); // throw own exception
		}
		else {
			
		}
	}

	public static void main(String[] args) {
		ThrowException te=new ThrowException();
		try {
			te.sum(-1);
		}
		catch(Exception e) {
		System.out.println("Exception handeled");	
		}
	}

}
