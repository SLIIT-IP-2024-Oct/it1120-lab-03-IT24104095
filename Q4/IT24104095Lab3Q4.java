import java.util.Scanner;
	public class IT24104095Lab3Q4{
		public static void main(String[] args){
		
		//Open a scanner
			Scanner input=new Scanner(System.in);

		//Define the variables
			int number;
			int digit10000=0, digit1000=0, digit100=0, digit10=0, digit1=0;

		//Take the input
			System.out.print("Enter a five digit number: ");
			number =input.nextInt();

		//Do the calculations to find the place values
			if(number >=1000 && number <=99999){
				digit10000=number/10000;
				digit1000=(number/1000)%10;
				digit100=(number/100)%10;
				digit10=(number/10)%10;
				digit1=(number/1)%10;

				System.out.println(digit10000+ " "+digit1000+ " "+digit100+ " "+digit10+ " "+digit1);
				
			} else {
				System.out.println("Error: Please enter a valid five-digit value");
				}
				
			
			input.close();
		}
	}

		