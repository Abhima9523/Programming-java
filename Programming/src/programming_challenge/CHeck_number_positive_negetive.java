package programming_challenge;

import java.util.Scanner;

public class CHeck_number_positive_negetive 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you number");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("negative number");
		}
		else if(n==0)
		{
			System.out.println("number is zero");
		}
		else {
			System.out.println("positive number");
		}
	}

}
