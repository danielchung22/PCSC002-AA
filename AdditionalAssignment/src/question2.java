import java.util.InputMismatchException;
import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {

		int adultset, kidsset, saladside, desertside;
		int adultprice = 20, kidsprice = 12, saladprice = 4, desertprice = 5;
		int adultcost, kidscost, saladcost, desertcost;
		int totalcost;
		int cont;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Do you wish to proceed? 1 - Yes; 2 - No");
		cont = keyboard.nextInt();
		
		if (cont==1) {
		
		System.out.println("\nWelcome to the rotary club fundraiser take out order system");
		System.out.println("Here is the prices for our items on sale today");
		System.out.println("Full Meals");
		System.out.println("Adult Sets - $20");
		System.out.println("Kids Sets - $12");
		System.out.println("Side Dishes");
		System.out.println("Salad - $4");
		System.out.println("Dessert - $5");
		
		boolean continueInput=true;
		do {
			try {
		System.out.println("\nPlease insert the number of adult sets you would like to purchase: ");
		adultset = keyboard.nextInt();
		
		boolean continueInput2=true;
		do {
			try {
		System.out.println("Please insert the number of kids sets you would like to purhcase: ");
		kidsset = keyboard.nextInt();
		
		boolean continueInput3=true;
		do {
			try {
		System.out.println("Please insert the number of salad side orders you would like to purchase:");
		saladside = keyboard.nextInt();
		
		boolean continueInput4=true;
		do {
			try {
		System.out.println("Please insert the number of dessert side orders you would like to purchase: ");
		desertside = keyboard.nextInt();
		
		adultcost = adultset * adultprice;
		kidscost = kidsset * kidsprice;
		saladcost = saladside * saladprice;
		desertcost = desertside * desertprice;
		
		totalcost = adultcost + kidscost + saladcost + desertcost;
		
		System.out.println("\nYour total cost is $" + totalcost);
		System.out.println("Thank you for supporting the fund raiser");
		
		continueInput = false;
		continueInput2 = false;
		continueInput3 = false;
		continueInput4 = false;
		
		} catch (InputMismatchException  ex) {
			System.out.println("Try again.  Please insert a valid number");
			keyboard.nextLine();  // Discard input
		
		} 
		} while (continueInput4) ;

			} catch (InputMismatchException  ex) {
				System.out.println("Try again.  Please insert a valid number \n");
				keyboard.nextLine();  // Discard input
			
			} 
			} while (continueInput3) ;
			
			} catch (InputMismatchException  ex) {
				System.out.println("Try again.  Please insert a valid number \n");
				keyboard.nextLine();  // Discard input
			
			} 
			} while (continueInput2) ;
		
			} catch (InputMismatchException  ex) {
				System.out.println("Try again.  Please insert a valid number \n");
				keyboard.nextLine();  // Discard input
			
			} 
			} while (continueInput) ;
		}
	
	else if (cont==2) {
		System.out.println("Thank you");
	} else {
		System.out.println("Please insert a valid input");
	}
		keyboard.close();
	}
}
