package day3;
import java.util.Scanner;
public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner kbd = new Scanner(System.in);
			String name;
			int age;
			String hobby; 
			String location; 
			String favColor;
		
			System.out.print("What is your name? ");
			name = kbd.next();
			System.out.print("How old are you? ");
			age = kbd.nextInt();
			System.out.print("What is your hobby? ");
			hobby = kbd.next();
			System.out.print("Where are you living? ");
			location = kbd.next();
			System.out.print("What is your favorite color? ");
			favColor = kbd.next();
			
			System.out.print("So your name is ");
			System.out.println(name);
			System.out.print("Your age is ");
			System.out.print("Your hobby is ");
			System.out.println(hobby);
			System.out.print("You are living in ");
			System.out.println(location);
			System.out.println("Your favorite color is ");
			System.out.println(favColor);
			
			
	}

}
