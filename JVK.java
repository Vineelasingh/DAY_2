package day_2;

import java.util.Scanner;

public class JVK {

	public static void main(String[] args) {
		System.out.println("enter year of birth : ");
		System.out.println("enter year of current :");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(b<a)
		{
			b=100-b;
			c=a+b;
			System.out.println("your age is "+c);
		}
		else 
		{
			System.out.println("your age is "+(b-a));
		}


	}

}
