package lab10;
import java.util.Scanner;
public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a max number: ");
		int max = input.nextInt();
		int i = 0; 
		int total = 0;
		
		while (i<= max) {
			System.out.println("Number" + i + " Squared is " + (i*i));
			total=total + (i*i);
			i++;
		}
		System.out.println("Sum Square is " + total);
		
	}

}
