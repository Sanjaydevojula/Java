package javapgms;
import java.util.*;


public class NoofDuplicates {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	int a[]= {10,20,10,30,10,40,30,40};
	int count=0;
	System.out.println("Enter Num :");
	int search_num=sc.nextInt();
	for(int i=0;i<a.length;i++) {
		if (search_num==a[i]) {
			count++;
		}
	}
	System.out.println("Number :"+search_num+ " repeated "+ count + " times");
	}

}
