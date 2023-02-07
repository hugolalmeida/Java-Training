package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDup {

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		//The Array List
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
		int total=0;
		ArrayList<Integer> duplicate= new ArrayList<Integer>();
		
		for (int i = 0; i<listNum.size(); i++) {
			 total += listNum.get(i);
			
			System.out.println(i +"      " + listNum.get(i));
		
		}
		 duplicate=dups(listNum);
		
		
		
		System.out.println("There are " + listNum.size() + " items in the ArrayList.\r\n"
				+ "The sum total of numbers in the ArrayList is " + total + ".\r\n"
						+ "The following numbers were duplicated in the ArrayList: " + duplicate);
		//Do it again
		    boolean validnum = false;
		do {
		System.out.println("Do you wish to play again? (Y/N): ");
		String Input = in.nextLine();
		if (Input.equalsIgnoreCase("Y")) {
		listNum.clear();
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
		
	public static  ArrayList<Integer> dups(ArrayList<Integer> listNum) {
		 
		 ArrayList<Integer> duplicate= new ArrayList<Integer>();
		//operation
		for (Integer i:listNum) {
		//sublist
			Integer	value=listNum.get(i);
			
			ArrayList<Integer> duplicateNum= new ArrayList<Integer>(listNum.subList(i+1,listNum.size()));
		
			
		
			if(duplicateNum.contains(value)) {
			if(!duplicate.contains(value)) {
				duplicate.add(value);
				}
				
		} 
		
		}
		
		return duplicate;
		
		
	}	 
	}
