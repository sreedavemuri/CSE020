import java.util.Scanner;

public class ChooseFunc {

	public static void main(String[] args) {

		System.out.println("This program supports 4 functions of a max number:");
		System.out.println("\t1. SumAll");
		System.out.println("\t2. SumSquare");
		System.out.println("\t3. Factorial");
		System.out.println("\t4. Fibonacci");

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Please choose the function you want:");
			int func = input.nextInt();

			System.out.print("Please enter the max number: ");
			int max = input.nextInt();
			long [] resArr = new long [max+1];

			for (int i = 1; i <= max; i++) {
				if (func == 1) {
					resArr[i] = resArr[i-1] + i;
				} else if (func == 2) {
					// Fill-in (Sum Square)
					resArr[i] = resArr[i-1] + i*i;
				} else if (func == 3) {
					// Fill-in (Factorial)
					resArr[0] =1;
					resArr[i] = resArr[i-1]*i;
					} else if (func == 4) {
					// Fill-in (Fibonacci)
						if(i==1) {
							resArr[1] = 1;
						}else {
							resArr[i] = resArr[i-1] + resArr[1-2];
						}
				} else {
					System.out.println("Error: Do not know " + func);
					// Fill-in (Stop the for-loop from iterating)
					break;
					
				}
			}

			System.out.print("Do you wish to repeat inputs? (1 for yes): ");
			if (input.nextInt() == 1) {
				// Fill-in (should go back to top of the loop)
			}else {
				
		
			System.out.print("Do you wish to print out all the results? (1 for yes): ");
			if (input.nextInt() == 1) {
				System.out.println("Results in the array:");
				System.out.println("\tIndex\tValue");
				for (int i = 0; i <= max; i++) {
					// Fill-in (print out the array index and the content)
					System.out.println(i + " " + resArr [i]);
				}
					
			}

			System.out.print("Do you wish to end the program? (1 for yes): ");
			if (input.nextInt() == 1) {
				// Fill-in (End the while(true) loop)
				break;
			}
			}
		}
	}
}