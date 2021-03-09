import java.util.Scanner;

public class BooleanIfElse{
	public static void main(String[] args) {
		int a = 0, b = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		a = in.nextInt();
		System.out.print("Input the second number: ");
		b = in.nextInt();

		if (a > b)
			System.out.println(a + " is greater than " + b);
		//else if is used to make the code more effecient and avoid using too many if statements. 
		//else if statements are nested under the main if loop above. 
		else if (a < b)
			//a is less than b
			System.out.println(a + " is less than " + b);
		else if (a==b)
			// a is equal to b
			System.out.println(a + " is equal to " + b);
		else if (a>=b)
			// a is greater than or equal to b
			System.out.println(a + " is greater or equal to " + b);
		else if (a<=b)
			// a is less than or equal to b
			System.out.println(a + " is less than or equal to " + b);
		else if (a !=b)
			// a is not equal to b. 
			System.out.println(a + " is not equal to " + b);
	}
} 