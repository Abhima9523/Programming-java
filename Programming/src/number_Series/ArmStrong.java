package number_Series;

import java.util.Scanner;

public class ArmStrong 
{
	public static boolean isArm(int n)
	{
		int num=n;
		int nodigit=countdigit(n);
		int Final=0;
		while(n>0)
		{
			int rem=n%10;
			Final=Final+pow(rem,nodigit);
		}
		return Final==num;
		
	}
	public static int pow(int base, int pow)
	{
		int result=1;
		int i=0;
		while(i<pow)
		{
			result=result*base;
			i++;
			
		}
		return result;
	}
	public static int countdigit(int n)
	{
		int count=0;
		while(0<n)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		System.out.println(isArm(n));
		boolean eq=isArm(n);
		if(eq) {
			System.out.println("armstrong number");
		}
		
	}
}

