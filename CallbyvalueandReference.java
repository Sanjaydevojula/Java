package javapgms;

public class CallbyvalueandReference {
	
	int num;
	
	void display(int num) {
		num=num+10;
		System.out.println(num);
		
	}
	void m2(CallbyvalueandReference cv) {
	cv.num=cv.num+10;
		System.out.println(cv.num);
	}

	public static void main(String[] args) {
		CallbyvalueandReference cv= new CallbyvalueandReference();
		cv.num=50;
		int num=100;
		System.out.println(num);
		cv.display(num);// calling by value method is changing value and original value is not impacted
		System.out.println("After method"+num);// original value again as we called method by value
		cv.m2(cv);
		System.out.println("After method"+cv.num);// value changed as we called method by value

	}

}
