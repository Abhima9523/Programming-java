package number_Series;

import java.util.Scanner;

public class Nth_prime_number 
{
	public class Check_prime 
	{
		public static boolean check(int n)
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
				return true;
			}
			else {
				return false;
			}
		}
		public static void print(int n)
		{
			int c=0;
			for(int i=0; ; i++)
			{
				check(i);
				System.out.print(i+" ");
				c++;
				if(c==n)
				{
					break;
				}
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your number");
			int n=sc.nextInt();
			System.out.println(check(n));
			print(n);
		}
	}
}
