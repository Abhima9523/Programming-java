package digit;

import java.util.Scanner;

public class Sum_of_digit 
{
	public static int sum(int n)
	{
		int sum=0;
		while(n !=0)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		System.out.println(sum(n));
	}

}
