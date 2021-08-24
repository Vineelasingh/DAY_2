package day_2;
import java.util.*;
public class GreenLights {

	public static void main(String[] args) {
		float s,d,t,speed,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter speed : ");
		s=sc.nextFloat();
		System.out.println("enter distance :");
		d=sc.nextFloat();
		System.out.println("enter time : ");
		t=sc.nextFloat();
		speed=s/3600;
		time=d/speed;
		if(t>time)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
				

	}

}
