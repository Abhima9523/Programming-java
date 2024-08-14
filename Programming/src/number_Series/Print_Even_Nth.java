package number_Series;

import java.util.Scanner;

public class Print_Even_Nth
{
	public static void print(int n)
	{
		int p=0;
		for(int i=0; ; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				p++;
			}
			if(p==n)
			{
				break;
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
