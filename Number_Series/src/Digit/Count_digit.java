package Digit;

import java.util.Scanner;

public class Count_digit 
{
	public static void digit(int n)
	{
		int count=0;
		while(0<n)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your digit");
		int n=sc.nextInt();
		digit(n);
	}
}
