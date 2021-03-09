package lab9;

import java.util.Scanner;

public class anyaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");
	
		int max = input.nextInt();
		int num = max + 1;
		int total = 0;
		int i = 0;
		while ( i <= max) {
			System.out.println("Please enter the " + (i));
			int newVal = input.nextInt();
			total = total + newVal; 
			i++;
	}
System.out.println("The average of all the number is " + (total/num));
}
}
