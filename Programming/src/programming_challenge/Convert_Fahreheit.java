package programming_challenge;

import java.util.Scanner;

public class Convert_Fahreheit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your temp in f :");
		float f=sc.nextFloat();
		float cel=(f-32)*5/9;
		System.out.println("celsius :"+cel);
		
		
	}

}
