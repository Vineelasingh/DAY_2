package day_2;
import java.util.*;
public class SeatAllocation2 {

	public static void main(String[] args) {
		int r,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row : \n ");
		r=sc.nextInt();
		System.out.println("enter columns : \n ");
		c=sc.nextInt();
		System.out.println("enter roll no : \n ");
		n=sc.nextInt();
		if((n<=r) || (n%r==1) || (n%r==0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
