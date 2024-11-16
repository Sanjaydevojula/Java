package javapgms;

import java.util.Arrays;

public class TwoDimenArray {

	public static void main(String[] args) {
 int a[][]= {{1,2},{2,4}};
 int b[][]= new int[2][4];
 b[0][0]=2;
 b[0][1]=6;
 b[0][2]=8;
 b[0][3]=8;
 b[1][3]=9;
 b[1][0]=5;
 b[1][1]=6;
 b[1][2]=9;
 //System.out.println(Arrays.toString(a));
 
 for(int i=0;i<b.length;i++) {
	 System.out.println(b.length);
	 for(int j=0;j<b[i].length;j++) {
		 System.out.println(b[i][j]);
	 }
	 
 }
for(int c[]:a) {
	for(int d:c) {
		System.out.print(d+",");
	}
}
	 
	}

}
