package programming_challenge;

import java.util.Scanner;

public class Categorize {

	public static void main(String[] args) {

		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Year");
		int age=s.nextInt();
		if(age< 13)
		{
			System.out.println("Child");
		}
		else if(age< 20)
		{
			System.out.println("teen");
		}
		else if(age< 60)
		{
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}

}
