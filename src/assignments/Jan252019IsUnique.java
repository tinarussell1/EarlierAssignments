package assignments;

import java.util.Scanner;

public class Jan252019IsUnique {

	private static Scanner input;
	
	public static void main(String[] args) {	
		input = new Scanner(System.in);
		
	//Friday Assignment #1, determine if all characters in string are unique.
	System.out.println("Enter a string with unique or non-unique character.");				
	String str1 = input.nextLine();
	//Friday unique true/false
	boolean result = isUnique(str1);
	System.out.println("Unique true or false: " + result);	
	}
	
	public static boolean isUnique(String input) {
		//Outer loop
		for(int i=0; i< input.length(); i++) {
			char outerLetter = input.charAt(i);
			
			for(int j= i+1; j<input.length(); j++) {
				char innerLetter = input.charAt(j);
				if (outerLetter == innerLetter) {
					return false;
				}
			}
		}
	return true;

	}		
}

