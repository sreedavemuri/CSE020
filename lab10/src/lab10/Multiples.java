package lab10;
import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the max number: ");
		int max = input.nextInt();
		System.out.print("Please enter Base Number: " );
		int base = input.nextInt();
		
		for (int i = 0; (i+i) <= max; i++) {
			int num = ((base * ((i+i)/2)));
			//System.out.println(i);
			if (num <= max) {
			System.out.println("Multiple:" + num);
			}
					}
		
		}
	
}