package javapgms;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Week");
		int Week;
		Week=sc.nextInt();
		System.out.println("Entered Week No : "+Week);
		switch(Week){
		case 1:
			System.out.println("Monday");break;
		case 2:
			System.out.println("Tuesday");break;
		case 3:
			System.out.println("Wednes");break;
		case 4:
			System.out.println("Thurs");break;
		case 5:
			System.out.println("Fri");break;
		case 6:
			System.out.println("Sat");break;
		case 7:
			System.out.println("Sun");break;
		default:
			System.out.println("Invalid");

		}





	}

}
