package programming_challenge;

import java.util.Scanner;

public class Aera_triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height number :");
		double h=sc.nextDouble();
		System.out.println("enter width number :");
		double b=sc.nextDouble();
		double aera=(b*h)*1/2;
		System.out.println("teringle area :"+aera);
	}
}
