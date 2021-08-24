package day_2;
import java.util.*;

public class Marks {

	public static void main(String[] args) {
				System.out.println("enter your marks:");
				int n;
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				if ((n==100))
				{
					System.out.println("your grade is S");
				}
				else if ((n<=100)&&(n>90))
				{
					System.out.println("your grade is A");
				}
				else if ((n<=90)&&(n>80))
				{
					System.out.println("your grade is B");
				}
				else if ((n<=80)&&(n>70))
				{
					System.out.println("your grade is C");
				}
				else if ((n<=70)&&(n>60))
				{
					System.out.println("your grade is D");
				}
				else if ((n<=60)&&(n>50))
				{
					System.out.println("your grade is E");
				}
				else if ((n<50))
				{
					System.out.println("you are fail F");
				}
				else
				{
					System.out.println("invalid input");
				}
				
				

			}



	}
