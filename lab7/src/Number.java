import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		char alpha;
		if		((num >= 0) && (num <= 25)) {
			alpha = (char)('A' + num);
		
			System.out.println(num + " character of the alphabet is " + alpha);
		} else {
			System.out.println("Outside of acceptable range.");
		}
	}

}
