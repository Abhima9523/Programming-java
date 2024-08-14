package Digit;

import java.util.Scanner;

public class Even_digit 
{
	public static void digit(int n)
	{
		while(0<n)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.print(rem);
			}
			n=n/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your digit");
		int n=sc.nextInt();
		digit(n);
	}

}
