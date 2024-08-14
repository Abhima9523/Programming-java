package number_Series;

import java.util.Scanner;

public class Fibonacci 
{
	public static void print(int num)
	{
//		if(num<0) return;
//			System.out.print(0+" ");
//		if(num==0) return;
//			System.out.print(1+" ");
		
		int first=0,second=1;
		System.out.print(first+" ");
		System.out.print(second+" ");
		while(first+second<=num)
		{
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to fibonacci");
		System.out.println("Enter your number");
		int num=sc.nextInt();
		print(num);
	}

}
