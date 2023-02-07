package week8;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> listNum= new ArrayList<Integer>();
		boolean playing = false;
		
		do {
		
		//variables
		int number = 0;
		String input = null;
		
		System.out.println("This program will ask the user to enter a series of numbers.\r\n"
					+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\r\n"
					+ "The program will then display the array of numbers and the sum total of those numbers.");
		
		// get numbers
		boolean Valid = false;
		
		do {	
		System.out.println("Please enter a number (or just hit enter to finish): ");
		try {
		input=in.nextLine();
			if(input.isEmpty()) {
			break;
		}
			
			number = Integer.parseInt(input);
		listNum.add(number);
			Valid = false;
		
		
		} catch (Exception e) {
		System.out.println("Invalid Response! Please enter a whole number.");
		
		} 
		} while(!Valid);
		
		//method return
		
		System.out.println("Index  Item");
		for (int i = 0; i<listNum.size(); i++) {
			System.out.println(i +"      " + listNum.get(i));
		}
		
		int total=sumValues(listNum);
		
		
		System.out.println("There are " + listNum.size() + " items in the ArrayList.\r\n"
				+ "The sum total of numbers in the ArrayList is " + total + ".");
		//Do it again
		    boolean validnum = false;
		do {
		System.out.println("Do you wish to play again? (Y/N): ");
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
		
	public static  int sumValues(ArrayList<Integer> listNum) {
		int total=0;
		 
		for (Integer i :listNum) {
			
			total += i;
		}
		return total;
		
		//operation
		
		
	}	 
	}
