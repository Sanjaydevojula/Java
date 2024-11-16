package javapgms;

public class TypeCasting {

	//upcasting-- smaller to large- automatic
	// int-- long
	// float-- double
	
	//downcasting- larger to smaller- should do casting explicitly
	//long-- int
	// double- float
	public static void main(String[] args) {
		
		int i=100;
		long Int=i; // upcasting automatic
		System.out.println(Int);
		
		//downcasting- manually
		long longvalue=1000;
		int iv=(int) longvalue;
		
		double d= 10.453543;
		float f=(float)d;
		System.out.println(f);
			
				

	}

}
