package numbers_check;

import java.util.Scanner;

public class Check_leapYear 
{
	public static void check(int n)
	{
		if(n%400==0 || n%4==0 && n%100!=0) {
			System.out.println("leap year");
		}
		else {
			System.out.println(" Not leap year");
		}
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Year");
		int n=s.nextInt();
		check(n);
	}

}
