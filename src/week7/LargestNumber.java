package week7;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int firstnum = 0;
		int secondnum = 0;
		int thirdnum = 0;
		
		
		boolean playing = false;
		do {
		System.out.println("This program will ask the user for three numbers and determine which of the three is the largest.");
		
		//variables
		
		
		// get numbers
		boolean Valid = false;
		
		do {
		System.out.println("Enter the first number: ");
		try {
		 firstnum = Integer.parseInt(in.nextLine());
		Valid = false;
		} catch (Exception e) {
		System.out.println("Invalid Response! Please enter a whole number.");
		Valid = true;
		} 
		} while(Valid);
		
		//ending number
		boolean End = false;
		do {
		System.out.println("Enter the second number: ");
		try {
		secondnum = Integer.parseInt(in.nextLine());
		End = false;
		} catch (Exception e) {
		System.out.println("Invalid Response! Please enter a whole number.");
		End = true;
		} 
		} while(End);
		
		//multiplier number
		boolean multi = false;
		
		do {
		System.out.println("Enter the third number: ");
		try {
		 thirdnum = Integer.parseInt(in.nextLine());
		multi = false;
		} catch (Exception e) {
		System.out.println("Invalid Response! Please enter a whole number.");
		multi = true;
		} 
		} while(multi);
		
		int Rfirstnum = firstnum; 
		int Rsecondnum = secondnum; 
		int Rthirdnum = thirdnum;
		//method return
		int value=largestNumber(Rfirstnum, Rsecondnum, Rthirdnum);
		System.out.println("The largest of the three numbers is: " 
		+ value);
		
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
		
		} while(playing);
		}
		
	public static int largestNumber(int Rfirstnum, int Rsecondnum, int Rthirdnum) {
		int value=0;
		
		//operation
		if (Rfirstnum>Rsecondnum && Rfirstnum>Rthirdnum) {
		value=Rfirstnum;
		
		} else if (Rsecondnum>Rfirstnum && Rsecondnum>Rthirdnum) {
			value=Rsecondnum;
		
		}  else {
			value=Rthirdnum;
		}
		return (value);
		 
		 
		}
		 
		}	

	

