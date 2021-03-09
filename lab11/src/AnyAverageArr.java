
import java.util.Scanner;
public class AnyAverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("This program will find the average of any numbers: ");
System.out.print("Please choose ammount of number to average");
int num = input.nextInt();
int[]numsArr = new int [num];
int i = 0;
for(i = 1; i <=num; i++) {
	System.out.print("Pleased enter the" + i + "number: ");
	numsArr[i-1] = input.nextInt();
}
System.out.println("The numbers being averaged: "); 
int total = 0;
 for (i= 0; i< num; i++) { 
	 System.out.print(numsArr[i] + " ");
	 total = total + numsArr[i];
	 if ((i+1)%5 ==0) {
		 System.out.println();
	 }
	 
 }
 System.out.println();
 System.out.println("Average is: " + total/num);


	}

}
