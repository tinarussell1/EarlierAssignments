package assignments;

import java.util.Scanner;

public class Jan252019Palindrome {

	private static Scanner input;

	public static void main(String[] args) {	
		input = new Scanner(System.in);	
		//Friday Assignment #5, check string if palindrome 
		String originalStr5, reverse = "";
		System.out.println("Enter a string to check if it is a palindrome");
		originalStr5 = input.nextLine();
		int L = originalStr5.length();
		
		for (int i = L - 1; i >= 0; i--) {
			reverse = reverse + originalStr5.charAt(i);
		}
		if (originalStr5.contentEquals(reverse)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
		}

	}

}
