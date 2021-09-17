package javapgms;

public class String_duplicate {

	public static void main(String[] args) {
String[] name = {"Sanjay","Sai","Sanjay","Sai","manasa","Sharada"};

for(int i= 0 ; i<name.length;i++) {
	for(int j=i+1 ; j<name.length;j++) {
		if(name[i].equals((name[j])))
		{
			System.out.println("duplicate :"  +name[j]);
			//System.out.println("no of times:" +name[j]);
		}
	}
}

	}
}
	
