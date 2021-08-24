package day_2;
import java.util.*;

public class SeatAllocation {

	public static void main(String[] args) {
		int r,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows: ");
		r=sc.nextInt();
		System.out.println("enter the no of colums :");
		c=sc.nextInt();
		System.out.println("enter the roll no of student :");
		n=sc.nextInt();
		if((n<c)||(n%c==1)||(n%c==0))
				{
			System.out.println("yes");
				}
		else
		{
			System.out.println("no");
		}
	}

}
