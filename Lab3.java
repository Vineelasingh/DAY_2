package day_2;
import java.util.*;
public class Lab3 {

	public static void main(String[] args) {
		int a,b,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value :");
		a=sc.nextInt();
		System.out.println("Enter b value :");
		b=sc.nextInt();
		System.out.println("Enter c value :");
		c=sc.nextInt();
		System.out.println("Enter n value :");
		n=sc.nextInt();
		if((n<=a)&&(n<=b)&&(n<=c))
		{
			System.out.println("a,b,c can accomodate n no of students");
		}
		
		else if((n<=a)&&(n<=b))
				{
			System.out.println("a,b can accomodate n no of students");
				}
		else if ((n<=b)&&(n<=c))
		{
			System.out.println("b,c can accomodate n no of students");
		}
		else if((n<=c)&&(n<=a))
		{
			System.out.println("c,a can accomodate n no of students");
		}
		
		else
		{
			System.out.println("none of the labs can accomodate n no of studentsn");
		}
		
		

		}

}
