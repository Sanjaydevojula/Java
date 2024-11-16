package javapgms;

public class WrapperClass {

	// primitive int float,double boolean
	// non primitive are  all collections
	// in collections we can store data in object format not in primitive so to work on collections we should convert 
	// primitive to Object type using wrapper class
	/*int-- Integer
	float-Float
	char-Character
	double-Double */
	
	
	public static void main(String[] args) {
		int i=10;   // primitive
		double d=10.5;
		char c='a';
		boolean b=true;
		
		// converting primitive to Object	-- autoboxing
		
		Integer iobj=i;  //object
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		
		// object to primitive-- unboxing
		int intvalue=iobj;
		double dvalue=dobj;
		char cvalue=cobj;
		boolean bvalue=bobj;
		
		System.out.println(intvalue);		// object to primitive-- unboxing
		System.out.println(dvalue);
		System.out.println(cvalue);
		System.out.println(bvalue);
		
		// String----> to int , double, float , char
		String S1="Welcome";   // cannot convet to num
		String S2="100";
		String S3="200";
	int sum=Integer.parseInt(S2)+Integer.parseInt(S3); // converting String to Integer
		System.out.println(sum);
		// Similarly Double.parseDouble();
		String S4="True"; // then can convert using 
boolean bl=Boolean.parseBoolean(S4);
System.out.println(bl);

// String to Char--> cannot convert from String to char
		
		// int, float,double, char---> String
int x=100;
String X=String.valueOf(x); // one single method to convert to String, can convert char to String

		
} 
	

}
