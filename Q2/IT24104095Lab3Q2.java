import java.util.Scanner;
	public class IT24104095Lab3Q2{
		public static void main(String[] args){

		//Define the values and open the scanner
			double mnthSalary, otHrs, otRate, otAmnt, totalSalary;

			Scanner input=new Scanner(System.in);

		//Take all the keyboard inputs
			System.out.print("Enter the monthly salary: ");
			mnthSalary=input.nextDouble();
			System.out.print("\n");

			System.out.print("Enter the number of OT hours: ");
			otHrs=input.nextDouble();
			System.out.print("\n");

			System.out.print("Enter the OT hourly rate: ");
			otRate=input.nextDouble();
			System.out.print("\n");

		//Do the necessary calculations
			otAmnt=otHrs*otRate;
			totalSalary=mnthSalary+otAmnt;

		//Print the final result
			System.out.println("The total salary including OT is: "+ totalSalary);
		input.close();
		}
	}