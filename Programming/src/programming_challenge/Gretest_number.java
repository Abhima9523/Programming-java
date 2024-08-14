package programming_challenge;

import java.util.Scanner;

public class Gretest_number 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your first number");
		int a=sc.nextInt();
		System.out.println("enter your Second number");
		int b=sc.nextInt();
		System.out.println("enter your third number");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("largest number :"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("largest number :"+b);
		}
		else{
			System.out.println("largest number :"+c);
		}
		
	}

}
