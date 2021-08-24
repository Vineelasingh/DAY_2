package day_2;
import java.util.*;

public class VowelorConsonant {

	public static void main(String[] args) {
		System.out.println("enter a value :");
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		int value=(int)ch;
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("the given value is vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("the given value is consonant");
		
		}
		else
		{
			System.out.println("the given value is not an Alphabet");
		}

	}

}
