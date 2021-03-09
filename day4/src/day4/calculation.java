package day4;
import java.util.Scanner;
public class calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		short num1, num2;
		int add;
		int sub;
		float mul, div;
		double rem = 0; 
		
	System.out.print("Input two numbers: ");
	num1 = input.nextShort();
	num2 = input.nextShort();
	
	add = num1 + num2;
	sub = num1 - num2;
	mul = (float)num1 * num2;
	div = (float)num1 % num2;
	
	System.out.println(" The Sum is " + add);
	System.out.println("The difference is " + sub);
	System.out.println("The product is " + mul);
	System.out.println("THe quotiont is " + div);
	System.out.println("The remainder is " + rem);
	}

}
