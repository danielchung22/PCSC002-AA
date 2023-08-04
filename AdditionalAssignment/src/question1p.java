import java.util.Scanner;

public class question1p {

	public static void main(String[] args) {

		int proceed;
		int adultset, kidsset, saladside, desertside;
		int adultprice = 20, kidsprice = 12, saladprice = 4, desertprice = 5;
		int adultcost, kidscost, saladcost, desertcost;
		int totalcost;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Do you wish to proceed? 1 - Yes, 2 - No");
		proceed = keyboard.nextInt();
		
		if (proceed==1) {
		
		System.out.println("\nWelcome to the rotary club fundraiser take out order system");
		System.out.println("Here is the prices for our items on sale today");
		System.out.println("Full Meals");
		System.out.println("Adult Sets - $20");
		System.out.println("Kids Sets - $12");
		System.out.println("Side Dishes");
		System.out.println("Salad - $4");
		System.out.println("Dessert - $5");
		
		System.out.println("\nPlease insert the number of adult sets you would like to purchase: ");
		adultset = keyboard.nextInt();
		
		System.out.println("Please insert the number of kids sets you would like to purhcase: ");
		kidsset = keyboard.nextInt();
		
		System.out.println("Please insert the number of salad side orders you would like to purchase:");
		saladside = keyboard.nextInt();
		
		System.out.println("Please insert the number of dessert side orders you would like to purchase: ");
		desertside = keyboard.nextInt();
		
		adultcost = adultset * adultprice;
		kidscost = kidsset * kidsprice;
		saladcost = saladside * saladprice;
		desertcost = desertside * desertprice;
		
		totalcost = adultcost + kidscost + saladcost + desertcost;
		
		System.out.println("\nYour total cost is $" + totalcost);
		System.out.println("Thank you for supporting our fund raiser");

		}
		else if (proceed == 2 ) {
			System.out.println("Thank you for your time");
		}
		else { 
			System.out.println("Please insert a valid number");
		}
		keyboard.close();
	}
}