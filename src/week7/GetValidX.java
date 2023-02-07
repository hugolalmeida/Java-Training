package week7;

import java.util.Scanner;

public class GetValidX {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		//Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

		//Get an integer from the user
		int intNum = getValidInt(in, "Please enter a whole number: ", "Invalid Response! Please enter a whole number.");
		System.out.printf("The whole number your entered was: %d.%n", intNum);
		System.out.println("Now we will test your whole number in a math equation...");
		System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.%n", intNum, intNum + 10);
		System.out.println();

		//Get a floating-point from the user
		double doubleNum = getValidDouble(in, "Please enter a decimal-point number: ", "Invalid Response! Please enter a number.");
		System.out.printf("The float your entered was: %f.%n", doubleNum);
		System.out.println("Now we will test your floating-point number in a math equation...");
		System.out.printf("Adding 10 to your float would be: 10 + %f = %f.%n", doubleNum, doubleNum + 10);
		System.out.println();

		//Get a 'Y' or 'N' from the user
		playAgain = getValidYN(in, "Would you like to play again? (Y/N): ", "Invalid Response! Please answer with a 'Y' or 'N'");
		System.out.println();
		}// end of while (playAgain.equalsIgnoreCase("y"))
		}// end of Main()

	public static int getValidInt(Scanner in, String promp, String prom) {
		int intNum=0;
		boolean valid=false;
		do {
		try {
		System.out.println(promp);
		 intNum=Integer.parseInt(in.nextLine());
		 valid=true;
		} catch (Exception e) {
			System.out.println(prom);
		}
		} while(!valid);
		return intNum;
		
		
	}

	public static double getValidDouble(Scanner in, String Promp, String Prom) {
		double doubleNum=0;
		boolean Valid=false;
		do {
		try {
			System.out.println(Promp);
			 doubleNum=Double.parseDouble(in.nextLine());
			 Valid=true;
		} catch (Exception e) {
			System.out.println(Prom);
		}
		} while(!Valid);
		return doubleNum;
		
	}

	public static String getValidYN(Scanner in, String pro, String Pro) {
		String playAgain="";
		boolean again = false;
		
		do {
			System.out.println(pro);
			playAgain = in.nextLine();
			if (playAgain.equalsIgnoreCase("N")) {
				 again=false;
			
			}else if (playAgain.equalsIgnoreCase("Y")) {
				break;
			 
			} else {
			 System.out.println(Pro);
			 again=true;
			 } 
		
		} while (again);
		return playAgain;
			
	}
}

