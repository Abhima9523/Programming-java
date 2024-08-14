package assignment_operator;

public class Logical_operator 
{
	public static void main(String[] args) {
		String veg="";
		String nonveg="";
		if(veg=="bread" && nonveg=="chicken")
		{
			System.out.println("both veg and non veg");
		}
		else if(veg=="bread")
		{
			System.out.println("vegiterian");
		}
		else {
			System.out.println("non vegiterian");
		}
	}

}
