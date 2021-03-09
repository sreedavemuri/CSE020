package day4;
import java.util.Scanner;
public class interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String hobby; 
		String location; 
		String favColor; 
		float lbweight;
		double kgweight; 

		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?");
		name = input.next();
		input.nextLine();
		System.out.print("What are your hobbies?");
		hobby = input.nextLine();
		System.out.print("Do you live on or off campus?");
		location = input.nextLine();
		System.out.print("What is your favorite colo?");
		favColor = input.nextLine();
		System.out.print("What is your weight in pounds");
		lbweight = input.nextFloat();

kgweight = lbweight / 2.2;

System.out.print("So your name is " + name + ".");
System.out.print("You like to " + hobby + ".");
System.out.print("You live in " + location + ".");
System.out.print("Your favorite color is  " + favColor + ".");
System.out.print("Your weight is " + kgweight + ".");

	}

}
