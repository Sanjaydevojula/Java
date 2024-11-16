package javapgms;

public class MinNo {

	public static void main(String[] args) {
int a[]= {199,23,35,44,65,33,98,5};
int min=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]<min) {
	min=a[i];
	}
}
System.out.println(min);

	}

}
