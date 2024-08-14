package programming_challenge;

import java.util.Scanner;

public class Calculate_perimeter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number :");
		double a=sc.nextDouble();
		System.out.println("enter second number :");
		double b=sc.nextDouble();
		System.out.println("enter third number :");
		double c=sc.nextDouble();
		System.out.println("enter fourth number :");
		double d=sc.nextDouble();
		double Primeter=a+b+c+d;
		System.out.println("Preimeter :"+Primeter);
		
	}

}
