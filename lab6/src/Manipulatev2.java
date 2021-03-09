import java.util.Scanner;

public class Manipulatev2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double n1, n2;

		System.out.print("Please enter the first number:");
		n1 = input.nextDouble();

		System.out.print("Please enter the second number:");
		n2 = input.nextDouble();

		System.out.println("We support +, -, *, / and % operations");
		System.out.println("Choose 1 for +, 2 for -, 3 for *,  4 for / and 5 for %");
		
		System.out.print("Please choose the operation: ");
		int operation = input.nextInt();
		
		System.out.println("We support output types: short, int, float and double");
		System.out.println("Choose 1 for short, 2 for int, 3 for float and 4 for double");
		
		System.out.print("Please choose the output data type: ");
		int dataType = input.nextInt();
		
		double result = 0;
		
		if (operation == 1) {
			result = n1 + n2;
			System.out.println("Adding two numbers");
		} else if (operation == 2) {
			// using the template given, set the subtraction operation equal to 2
			result = n1-n2;
			// set result equal to the difference of the to inputs taken - n1 and n2. 
			System.out.println("Subtracting two numbers" );
		} else if (operation ==3) {
			// using the template given, set the multiplication operation equal to 2
			result = n1 * n2;
			// set result equal to the product of the to inputs taken - n1 and n2. 
			System.out.println("Multiplying two numbers" );	
		} else if (operation ==4 ) {
			// using the template given, set the division operation equal to 4
			if (n2 == 0) {
				System.out.println("Dividing by zero");
			// if denominator is not 0, then the calculation continues
			} else { 
				result = n1/n2;
			} 
			// // set result equal to the quotient of the to inputs taken - n1 and n2. 
			System.out.println("Dividing two numbers");
		} else if (operation ==5 ) {
			// using the template given, set the remainder operation equal to 5
			result = n1 % n2;
			// the modulo (percent sign) is a operator used to find the remainder of the function. 
			System.out.println("Remainder of two numbers");

		} else {

			System.out.println("Wrong operation type");
		}
		
		System.out.print("The result is ");
		if (dataType == 1) {
			System.out.println((short)result);
		} else if (dataType == 2) {
		//the dataType is set to the user selected type. 
			System.out.print((int)result);	
		//using the template above write typecast all of the results for the different datatypes. 
		} else if (dataType == 3) {
			System.out.print((float)result);	
		} else if (dataType == 4) {
			System.out.print((double)result);	
		} else {
			System.out.println("the wrong type to output");
		}
	}	
}
