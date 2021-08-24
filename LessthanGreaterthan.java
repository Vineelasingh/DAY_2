package day_2;
import java.util.*;
public class LessthanGreaterthan {

	public static void main(String[] args) {
		System.out.println("enter a value :");
		System.out.println("enter b value :");
		System.out.println("enter c value :");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a>b)&&(b>c))
		{
			System.out.println("a is big:"+a);
		}	
			else if(b>c)
			{
				System.out.println("b is big");
			}
				else if((a==b)&&(b==c))
				{
					System.out.println("all are equal");
				}
				else ;
				{
					System.out.println("c is big");
				}
				
					
			
				
		
		
		
		
		}
	}

