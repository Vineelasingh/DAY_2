package day_2;
import java.util.*;

public class FruitSelling {

	public static void main(String[] args) {
		System.out.println("enter the price of dozen mangoes:");
		System.out.println("enter the cost price:");
		System.out.println("enter the selling price:");
		Scanner sc=new Scanner(System.in);
		float a,b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		if(b-c>0)
		{
			System.out.println("loss Rs: "+(b-c));
		}
		else if (b-c<0)
		{
			System.out.println("profit Rs:  "+(c-b));
		}
		else
		{
			System.out.println("no profit no loss");
		}
		
		

	}

}
