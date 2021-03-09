package midtermPractice;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner user = new Scanner(System.in);
double radius, height, volume, pi, surfaceArea;

pi = 3.14;

System.out.print("Please enter radius: ");
radius = user.nextInt();
System.out.print("Please enter Height:");
height = user.nextInt();


volume = pi * radius*radius * height;
surfaceArea = 2 * pi * radius * radius  + 2 * pi * radius * height;
System.out.println("Volume = " + volume);
System.out.println("Surface Area = " + surfaceArea);

System.out.print("GoodBye!");

	}

}
