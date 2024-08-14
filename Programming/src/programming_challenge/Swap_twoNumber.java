package programming_challenge;

public class Swap_twoNumber 
{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		 //without third variable logic 1
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("a :"+a);
//		System.out.println("b :"+b);
		
		//Using third variable logic 2
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		 
		//Using third variable 
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a :"+a);
//		System.out.println("b :"+b);
		
	}

}
