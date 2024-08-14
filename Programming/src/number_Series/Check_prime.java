package number_Series;

import java.util.Scanner;

public class Check_prime 
{
	public static void check(int n)
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");;
		int n=sc.nextInt();
		check(n);
	}

}
