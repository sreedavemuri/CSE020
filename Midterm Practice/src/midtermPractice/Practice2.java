
package midtermPractice;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		double radius, volume, pi, surfaceArea, height; 
		pi = 3.14; 
System.out.println("Please enter the radius: ");
radius = user.nextDouble();

System.out.println("Please enter the height: ");
height = user.nextDouble();

volume = pi * radius * radius * height;

surfaceArea = 2 * pi * radius *radius + 2* pi* radius * height;
System.out.println("Volume is " + volume);
System.out.println("Surface Area is " + surfaceArea);
System.out.print("Goodbye!");

	
		// TODO Auto-generated method stub

	}

}

