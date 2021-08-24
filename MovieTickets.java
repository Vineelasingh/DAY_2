package day_2;
import java.util.*;

public class MovieTickets {

	public static void main(String[] args) {
		int age;
		double time1=13.30;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age : ");
		age=sc.nextInt();
		System.out.println("enter show timing : ");
		double time=sc.nextDouble();
		if(age>13)
		{
			if(time==time1)
			{
				System.out.println("Ticket price is $5");
			}
			else
			{
				System.out.println("Ticket price is $8");
			}
		}
		else if(time==time1)
		{
			System.out.println("Ticket price is $2");
		}
		else
		{
			System.out.println("Ticket price is $4");
		}
		

	}

}
