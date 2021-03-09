package bobcar;
import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int carType, daysUsed, clubMember, dayPrice = 0, basePrice = 0, memDiscount;
		int platinumPack = 0;
		double platPrice = 0.0;
		String carT = "";

		System.out.println("Available cars: 1 for Economy, 2 for Compact , 3 for Standard");

		System.out.println("Choose a car type: " );
		carType = scan.nextInt();
		System.out.println("Please enter the number of rental days: ");
		daysUsed = scan.nextInt();
		System.out.print("Club member? 1 for yes, 0 for no: ");
		clubMember = scan.nextInt();

		if (clubMember == 1) {
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			platinumPack = scan.nextInt();
		}

		if (carType == 1) {
			dayPrice = 35;
			basePrice = daysUsed * dayPrice;
			carT = "Economy";
		}
		if (carType == 2) {
			dayPrice = 45;
			basePrice = (daysUsed * dayPrice);
			carT = "Compact";

		} if (carType == 3) {
			dayPrice = 95;
			basePrice = daysUsed * dayPrice;
			carT = "Standard";
		}

		memDiscount = ((daysUsed/7) * dayPrice); 

		System.out.println("Base: days " + daysUsed + " for " + carT +   " @ $" + dayPrice + " per day: $" + basePrice);

		if (clubMember == 1) {
			System.out.println("Club Member Discount: - $" + memDiscount);

		}


		if (platinumPack == 1) {
			platPrice = basePrice * 0.15;
			System.out.println("Platinum Executive Package: + $" + platPrice);
		}

		System.out.println("Total estimate for rental: $" + (basePrice - memDiscount + platPrice) );

		scan.close();
	}
}



