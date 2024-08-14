package Digit;

import java.util.Scanner;

public class Reverse_Digit 
{
	public static void digit(int n)
	{
		int reverse=0;
		while(0<n)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your digit");
		int n=sc.nextInt();
		digit(n);
	}

}
