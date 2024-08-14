package Digit;

import java.util.Scanner;

public class Digit_factroial 
{
	public static void digit(int n)
	{
		int fact=1;
		while(0<n)
		{
			int rem=n%10;
			fact=fact*rem;
			n=n/10;
		}
		System.out.println("digit factorial :"+fact);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your digit");
		int n=sc.nextInt();
		digit(n);
	}

}
