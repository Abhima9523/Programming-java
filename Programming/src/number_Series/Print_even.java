package number_Series;

import java.util.Scanner;

public class Print_even 
{
	public static void print(int n)
	{
		for(int i=0; i<n; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		print(n);
	}

}
