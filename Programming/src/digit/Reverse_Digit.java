package digit;

import java.util.Scanner;

public class Reverse_Digit 
{
	public static int reverse(int n)
	{
		int reverse=0;
		while(n !=0)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		return reverse;
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		System.out.println(reverse(n));
	}


}
