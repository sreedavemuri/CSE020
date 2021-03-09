package day3;
import java.util.Scanner;
public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		

		System.out.print("Enter a number and I will ");
		System.out.print("square it for you:  ");
		int number =  kbd.nextInt();
		int theSquare = number * number;
		// thesquare = number * number;
	
		System.out.print(number + " squared = ");
		System.out.println(theSquare);
	}
}