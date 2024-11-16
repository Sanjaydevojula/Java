package javapgms;

public class MutablevsImmutable {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Sanjay");
		s.append("is");
		StringBuilder s1=new StringBuilder("Sanjay");
		s1.append("is a");
		String s3="Sanjay";
		s3.concat("Sahu");
		System.out.println(s1);
		System.out.println(s);
		System.out.println(s3);
	}

}
