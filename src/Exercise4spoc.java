import java.util.Scanner;
public class Exercise4spoc {
 
	public static void main(String[] args) {
		int ning = 0;
		while (ning ==0) {
		int pizzabase = 2;
		int price = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many ingredients?");
		ning = input.nextInt();
		
		if(ning > 0 && ning<=3) {
			price = 3;
		}
		if (ning > 3 && ning<=6) {
			price = 2;
		}if(ning > 6) {
			price = 1;
		}else {
			System.out.println("The number of ingredients must be greater than zero. Remember that the base price is 2€");
		}
		
		int preciofinal = pizzabase+(ning*price);
		System.out.println("Your final price is "+preciofinal+" euros." );
		}
	}
 
}

/*
Write a program in JAVA that:
• Display the following explanations on the screen:
The total price of a pizza will equal:
1) Fixed base price = € 2, plus
2) 3€ per extra ingredient, up to three ingredients, or
3) 2€ per extra ingredient, up to six ingredients, or
4) 1€ per extra ingredient for more than six ingredients.
• Ask the customer how many extra ingredients you want. If you enter a number of ingredients less than or equal to 0 (zero), you must display a message stating that the number of ingredients must be greater than zero and also remember the price of the base. 
• Calculate and display the price of a pizza according to the number of extra ingredients that the customer chooses.
*/