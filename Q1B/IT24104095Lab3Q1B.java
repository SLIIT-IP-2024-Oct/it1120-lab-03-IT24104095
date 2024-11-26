import java.util.Scanner;
	public class IT24104095Lab3Q1B {
		public static void main(String[] args) {
		
		//Define the variables
		double ricePrice, amountOfRice, totalRicePrice;
		double discountAmount = 10;

		//Open a Scanner
		Scanner input=new Scanner(System.in);
		
		//Take the inputs
		System.out.println("Enter tge price of 1kg of rice: ");
		ricePrice = input.nextDouble();
		if (ricePrice <0){
			System.out.println("Invalid Input. Terminating Program");
		return;
		}

		System.out.println("Enter the number of kilograms you want to buy: ");
		amountOfRice = input.nextDouble();
		if (amountOfRice <0){
			System.out.println("Invalid Input. Terminating Program");
		return;
		}

		//Calculate the final total price
		totalRicePrice = ricePrice*amountOfRice;
		totalRicePrice -= totalRicePrice*discountAmount/100;
		System.out.println("The totak amount with 10% discount is: " + totalRicePrice);

		input.close();
		}
	}