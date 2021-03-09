package lab9;

import java.util.Scanner;

public class sumall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		int i = 0;
		int total = 0;
		while ( i <= max) {
			System.out.println("Number " + i);
			total = total + i;
			i++;
		
			}
		System.out.println("Sum of all numbers is " + total);
}
}