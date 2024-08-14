package programming_challenge;

import java.util.Scanner;

public class Product_float_point 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number ");
		int b=sc.nextInt();
		float c=a*b;
		System.out.println("product :"+c);
	}
}
