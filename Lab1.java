package day_2;
import java.util.*;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Enter no of seats in x lab");
		System.out.println("Enter no of seats in y lab");
		System.out.println("Enter no of seats in z lab");
		int x,y,z;
		Scanner sc =new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if ((x<y)&&(x<z))
				{
			System.out.println("L1 lab has minimal seats");
				}
		else if ((y<z))
		{
			System.out.println("L2 lab has minimal seats");
		}
		else 
		{
			System.out.println("L3 lab has minimal seats");
		}
	}

}
