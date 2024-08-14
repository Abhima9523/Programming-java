package assignment_operator;

import java.util.Scanner;

public class Arithmetic_operator 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your number a :");
		int a=sc.nextInt();
		System.out.println("enter your number b :");
		int b=sc.nextInt();
		int add=a+b;
		int  sub=a-b;
		int multi=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("add :"+add);
		System.out.println("sub :"+sub);
		System.out.println("multi :"+multi);
		System.out.println("division :"+div);
		System.out.println("modules :"+mod);
		
	}

}
