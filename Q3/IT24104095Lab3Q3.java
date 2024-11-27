import java.util.Scanner;
	public class IT24104095Lab3Q3{
		public static void main(String[] args){

		//Define the values and Open the Scanner
			int count5000=0, count1000=0, count500=0, count200=0, count100=0;
			int count50=0, count20=0, count10=0, count5=0, count2=0, count1=0;
			int input;

			Scanner scanner=new Scanner(System.in);

		//Print the command and take the keyboard input
			System.out.print("Enter the Ruppee amount: ");
			input=scanner.nextInt();
		
		//Add the conditions and relevant validations
			if(input >=5000){
				count5000=input/5000;
				input%=5000;
			}

			if(input >=1000){
				count1000=input/1000;
				input%=1000;
			}

			if(input >=500){
				count500=input/500;
				input%=500;
			}

			if(input >=200){
				count200=input/200;
				input%=200;
			}

			if(input >=100){
				count100=input/100;
				input%=200;
			}

			if(input >=50){
				count50=input/50;
				input%=50;
			}

			if(input >=20){
				count20=input/20;
				input%=20;
			}

			if(input >=10){
				count10=input/10;
				input%=10;
			}

			if(input >=5){
				count5=input/10;
				input%=5;
			}

			if(input >=2){
				count2=input/2;
				input%=2;
			}

			if(input >=1){
				count1=input;
			}
			
		//Print the values
			System.out.println("5000 notes - "+ count5000);
			System.out.println("1000 notes - "+ count1000);
			System.out.println("500 notes - "+ count500);
			System.out.println("200 notes - "+ count200);
			System.out.println("100 notes - "+ count100);
			System.out.println("50 notes -  "+ count50);
			System.out.println("10 notes - "+ count10);
			System.out.println("05 notes - "+ count5);
			System.out.println("02 coins - "+ count2);
			System.out.println("01 coins - "+ count1);
		
			scanner.close();
		}
	}








	