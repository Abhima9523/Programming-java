package programming_challenge;

import java.util.Scanner;

public class Compound_interest 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your price");
		float p=sc.nextFloat();
		System.out.println("Enter your rate");
		float r=sc.nextFloat();
		System.out.println("Enter your time");
		float t=sc.nextFloat();
		double compound=p*Math.pow((1+r/100),t);
		System.out.println("compound interset :"+compound);
	}

}
