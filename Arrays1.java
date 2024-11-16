package javapgms;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
int a[]=new int[5];// 
int b[]= {10,20,30,40};
a[0]=10;
a[1]=100;
a[2]=105;
a[3]=103;
a[4]=102;
System.out.println(Arrays.toString(a));
System.out.println(b.length);

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
for(int c:b) {
System.out.print(c+" ");
}

	}

}