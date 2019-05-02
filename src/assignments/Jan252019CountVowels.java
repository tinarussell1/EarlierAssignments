package assignments;

import java.util.Scanner;

public class Jan252019CountVowels {

	private static Scanner input;

	public static void main(String[] args) {	
		input = new Scanner(System.in);	
		
		//Count vowels in a word.
		System.out.println("Enter a word to count vowels:");
		String str6 = input.nextLine();
		char[] str6Array = str6.toLowerCase().toCharArray();
		int vowelsCount = 0;
		
		for(int i=0; i<str6.length();i++) {
			if(str6Array[i] == 'a' || str6Array[i] == 'e' || str6Array[i] == 'i' || str6Array[i] == 'o' || str6Array[i] == 'u') {
				vowelsCount++;
			}
		}
		System.out.println("The word: " + str6 + " has  " + vowelsCount + " vowels.");
	}

}



