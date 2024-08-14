package digit;

import java.util.Scanner;

public class Convert_binary 
{
	public static void binary(int n)
	{			
		String s="";
		while(n !=0)
		{
			int rem=n%2;
			s=rem+s;
			n=n/2;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Decimal number");
		int n=sc.nextInt();
		binary(n);
	}

}
