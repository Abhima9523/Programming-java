package Digit;

import java.util.Scanner;

public class digit_sum 
{
	public static void digit(int n)
	{
		int sum=0;
		while(0<n)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("digit sum :"+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your digit");
		int n=sc.nextInt();
		digit(n);
	}

}
