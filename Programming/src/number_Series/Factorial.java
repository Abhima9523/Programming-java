package number_Series;

import java.util.Scanner;

public class Factorial 
{
	public static void print(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int n=sc.nextInt();
	print(n);
	}

}
