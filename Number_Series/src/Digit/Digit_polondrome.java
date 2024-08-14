package Digit;

import java.util.Scanner;

public class Digit_polondrome 
{
	public static void digit(int n)
	{
		int reverse=0;
		int num=n;
		while(0<n)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		if(num==reverse)
		{
			System.out.println("number is polindrome");
		}
		else {
			System.out.println("not number is polindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your digit");
		int n=sc.nextInt();
		digit(n);
	}

}
