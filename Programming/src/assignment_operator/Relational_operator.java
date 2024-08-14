package assignment_operator;

import java.util.Scanner;

public class Relational_operator 
{
	public static void check(int n)
	{
		if(n>18 && 0<n)
		{
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("not eligiblr for vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Age");
		int n=sc.nextInt();
		check(n);
	}

}
