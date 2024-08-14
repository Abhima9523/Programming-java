package programming_challenge;

import java.util.Scanner;

public class Check_odd_even 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else{
			System.out.println("odd number");
		}
	}

}
