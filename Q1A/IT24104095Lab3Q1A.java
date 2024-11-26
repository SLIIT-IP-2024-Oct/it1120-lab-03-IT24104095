import java.util.Scanner;
	public class IT24104095Lab3Q1A {
		public static void main(String[] args) {
		
		//Define the variables
		double ricePrice, amountOfRice, totalRicePrice;

		//Open a scanner
		Scanner input=new Scanner(System.in);

		//Take the inputs and validate them
		System.out.println("Enter the price of 1kg of rice: ");
		ricePrice = input.nextDouble();
		if (ricePrice <0){
			System.out.println("Invalid Price. Terminating program");
		return;
		}

		System.out.println("Enter the number of Kilograms you want to buy: ");
		amountOfRice = input.nextDouble();
		if (amountOfRice <0){
			System.out.println("Invalid Price. Terminating program");
		return;
		}

		//Calculate the Total Price
		totalRicePrice=ricePrice*amountOfRice;
		System.out.println("The total amount is: " + totalRicePrice);

		input.close();
		}
	}