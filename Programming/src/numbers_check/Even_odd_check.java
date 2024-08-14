package numbers_check;
import java.util.*;
public class Even_odd_check 
{
	public static void check(int n)
	{
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	public static boolean check1(int n)
	{
		return n%2==0;
	}
	public static void check2(int n)
	{
		if((n&1)==0)
		{
			System.out.println("even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		check2(n);
		System.out.println(check1(n));
		check(n);
		
	}

}
