package day_2;
import java.util.*;

public class fee {

	public static void main(String[] args) {
		System.out.println("Enter the student type : ");
		System.out.println("enter the tution fee : ");
		System.out.println("enter the bus fee : ");
		System.out.println("enter the hostel fee : ");
		String name;
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		switch(name)
		{
			case "MSDS"  :
				System.out.println("the fees should be paid by the student is:"+(a+b));
				break;
			case "MSH" :
				System.out.println("the fee should be paid by the student is :"+(a+c));
				break;
			case "MGSDS" :
				System.out.printf("the fee should be paid by the student is :"+((150/100)*a)+b);
				break;
			case "MGSH" :
				System.out.printf("the fee should be paid by the student is  :"+((150/100)*a)+c);
				break;
				default :
					System.out.println("invalid input");
				
			
			
		}
		

	}

}
