package day_2;
import java.util.*;

public class Lab_2 {

	public static void main(String[] args) {
		System.out.println("Enter no of seats in x lab");
		System.out.println("Enter no of seats in y lab");
		System.out.println("Enter no of seats in z lab");
		System.out.println("Enter the lab Allocated for ACE training");
		int x,y,z;
		String s;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		s=sc.next();
		if(s.equals("L3")) {
			if(x<y) {
				System.out.println("x has minimal seating");
			}
			else {
				System.out.println("y has minimal seating");
			}
		}
		if(s.equals("L2")) {
			if(x<z) {
				System.out.println("x has minimal seating");
			}
			else {
				System.out.println("z has minimal seating");
			}
		}
		if(s.equals("L1")) {
			if(z<y) {
				System.out.println("z has minimal seating");
			}
			else {
				System.out.println("y has minimal seating");
			}
		}
	}
}


