package week7;

import java.util.Scanner;

public class IsBetween {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean playing = false;
		System.out.println("This program will ask the user for three numbers and determine if the second number lies between the first and the third.");
		do {
		
		//variables
		int lownum = 0;
		int betweennum = 0;
		int highnum = 0;
		
		
		// get numbers
		boolean Valid = false;
		do {
		System.out.println("Please enter the low number: ");
		try {
		 lownum = Integer.parseInt(in.nextLine());
		Valid = false;
		} catch (Exception e) {
		System.out.println("Invalid Response! Please enter a whole number.");
		Valid = true;
		} 
		} while(Valid);
		
		//between number
		boolean End = false;
		do {
		System.out.println("Please enter the number to be tested (the between number): ");
		try {
		betweennum = Integer.parseInt(in.nextLine());
		End = false;
		} catch (Exception e) {
		System.out.println("Invalid Response! Please enter a whole number.");
		End = true;
		} 
		} while(End);
		
		//multiplier number
		boolean multi = false;
		do {
		System.out.println("Please enter the high number: ");
		try {
		 highnum = Integer.parseInt(in.nextLine());
		multi = false;
		} catch (Exception e) {
		System.out.println("Invalid Response! Please enter a whole number.");
		multi = true;
		} 
		} while(multi);
	
		
		//method return
		if (isBetween(lownum, betweennum, highnum)) {
			System.out.println(betweennum + " lies between the numbers " + lownum + " and " + highnum);
		
		} else {
		System.out.println(betweennum + " DOES NOT lie between the numbers " + lownum + " and " + highnum);
		}
		
		
		//Do it again
		    boolean validnum = false;
		do {
		System.out.println("Would you like to make another calculation? (Y/N): ");
		String Input = in.nextLine();
		if (Input.equalsIgnoreCase("Y")) {
		validnum = false;
		playing = true;
		 
		}
		else if (Input.equalsIgnoreCase("N")) {
		validnum = false; 
		playing = false;
		} else {
		System.out.println("Invalid Response! Please answer with a 'Y' or 'N'.");
		validnum = true;
		}  
		}while(validnum);
		} while (playing);
		}
		
	public static boolean isBetween(int firstNumber, int midNumber, int thirdNumber) {
		 
		
		//operation
		
		if (firstNumber<thirdNumber && midNumber<=thirdNumber && firstNumber<midNumber) {
			return true;
		}else {
			return false;
		}
		
	}	 
	}
