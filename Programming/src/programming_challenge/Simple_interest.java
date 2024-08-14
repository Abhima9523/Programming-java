package programming_challenge;

import java.util.Scanner;

public class Simple_interest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Principle number :");
		float p=sc.nextFloat();
		System.out.println("enter rate number :");
		float r=sc.nextFloat();
		System.out.println("enter years number :");
		float y=sc.nextFloat();
		
		double interst=p*r*y;
		System.out.println("Interest :"+interst);

}
}