package javapgms;

public class NoofwordsString {

	public static void main(String[] args) {
String S= "this is a a a words in a String";
String A[]=S.split(" ");
System.out.println("No of words in String"+A.length);
for(int i=0;i<A.length;i++) {
	int count=1;
	for(int j=i+1;j<A.length;j++) {
		if(A[i].equals(A[j])){
			count++;
			A[j]="0";
			
		}
	}
		if(A[i]!="0") {
		System.out.println("Word : " +A[i]+ " repeated :" +count+ " times");
		//count=1;
	}
}

	}
	}

