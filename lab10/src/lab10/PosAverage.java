package lab10;

import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = 0;
		int count = 0; 
		int total = 0; 
		int number; 
		
		do { 
			System.out.print("Enter " + i + " number: ");
			number = input.nextInt();
			
			if (number > 0) {
				total = total + number;
				count = i++; 
			} else
				total = total; 
			
		} while (number >=0);
		
		System.out.println("Average is " + (total / (count +1)));
			}
			


}

