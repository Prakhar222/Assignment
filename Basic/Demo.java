import java.util.Scanner;



public class Demo {
	

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	String Input="[{a+<b*(c/d)>}-e]";
		
        switch (Input)
	 {

	case "[{a+<b*(c/d)>}-e]": 

		System.out.println("valid");

			break;

	case "[{a+<b*(c/d)>-e]":

		System.out.println("invalid closing bracket is missing } ");

			break;
		
	case "[a+<b*(c/d)>}-e]":

		System.out.println("invalid opening bracket is missing { ");

			break;
		
	case "[a+b*(c/d)>}-e]":

		System.out.println("invalid opening bracket is missing < ");

			break;

	case "[{a+<b*(c/d)}-e]":

		System.out.println("invalid closing bracket is missing > ");

			break;
	
	case "{a+<b*(c/d)>}-e]":
			
		System.out.println("invalid opening bracket is missing [ ");

			break;
		
	case "[{a+<b*(c/d)>}-e":

		System.out.println("invalid closing bracket is missing ] ");

			break;

	case "[{a+<b*c/d)>}-e]":
			
		System.out.println("invalid opening bracket is missing ( ");

			break;
	
	case "[{a+<b*(c/d>}-e]":

		System.out.println("invalid closing bracket is missing ) ");

			break;
		



	default:
		
 		System.out.println("Invalid Input Check your input");

			break;

		}
		
	
	}
	

}