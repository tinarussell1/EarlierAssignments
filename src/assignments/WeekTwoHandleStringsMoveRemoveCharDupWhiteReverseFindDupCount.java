package assignments;
import java.util.Scanner;

public class WeekTwoHandleStringsMoveRemoveCharDupWhiteReverseFindDupCount {

	public static void main(String[] args) {	

		Scanner input = new Scanner(System.in);
		
		//Write some method:
		//modifier => public static
		//return type => String
		//method name => removeChar
		//Parameter  => String and char
		
/*
		//primitive types all have methods for coding.
		int x =6;
		Integer y=8;
		boolean f = false;
		Boolean t = true;
		double d = 1.23;
		Double c = 1.23;
		long l = 1234;
		Long m = 1234L;
*/		


		System.out.println("#1 Please enter a string to remove a given character from.");
		String str1 = input.nextLine();
		
		System.out.println("Please enter a character to remove from string.");
		String letter = input.nextLine();
		char ltr1 = letter.charAt(0);
		String newString1 = removeChar(str1, ltr1);
		System.out.println("New string: " + newString1 + " with letter: " + ltr1 + " removed.");
		char[] word = {'A', 'v', 'e', 'r', 'a', 'n', 'g', 'e'};
		System.out.println(removeCharFromArray(word, ltr1));
		
		//#2 Write method to remove duplicate characters from string.
		System.out.println("#2 Please enter a string to remove duplicate char.");
		String str2 = input.nextLine();
		String newString2 = removeDuplicateChar(str2);
		System.out.println("New string: " + newString2 + " has no duplicates.");

		//#3 Write a program to count the number of vowels and consonants in a string
		//eg if the input is Java the result should be 2 vowels and 2 consonants.
		System.out.println();
		System.out.println("#3 Enter a word to count consonants and vowels:");
		String str3 = input.nextLine();
		
		str3 = str3.toLowerCase();
		int vowelsCount = 0, consonants = 0;
		
		for(int i=0; i<str3.length();i++) {
			char ch = str3.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else  if (ch >= 'a' && ch <= 'z') {
				consonants++;
			}
		}
		System.out.println("The word: " + str3 + " has  " + vowelsCount + " vowels.");
		System.out.println("The word: " + str3 + " has  " + consonants + " consonants.");
		
		//#4 Write a program to display first, the non-repeating characters of a string 
		//then append the repeating characters
		System.out.println("#4 Please enter a string to move repeating characters to end.");
		String str4 = input.nextLine();
		String newString4 = moveRepeatingChar(str4);
		System.out.println("New string: " + newString4);
		
		//#5 Write method to count the number of occurrences of the letter 'a' char array.
		System.out.println("#5 Please enter a string to count A.");
		String str5 = input.nextLine();
		int count5 = countA(str5);
		System.out.println("String: " + str5 + " has " + count5 + " A's");
		
		//#6 Write method to remove all white spaces from a char array.
		System.out.println("#6 Please enter a string to remove white spaces.");
		String str6 = input.nextLine();
		String newStr6 = removeWhiteSpaces(str6);
		System.out.println("String: " + newStr6 + " without white spaces");
		
		//#7 Write method to find duplicate characters in a char array.
		System.out.println("#7 Please enter a find duplicate characters");
		String str7 = input.nextLine();
		String newStr7 = findDuplicateChar(str7);
		System.out.println("String: " + newStr7 + " are duplicate characters");

		//#8 Write method to display the words in reverse order. 
		System.out.println("#8 Enter a string of words to be reverse.");
		String str8 = input.nextLine();
		String newStr8 = reverseWords(str8);
		System.out.println("String: " + newStr8 + " is reversed from: " + str8);
		
		System.out.println("The End of WeekTwo Monday Lab");
		
		input.close();
	}	
	//#1
	public static String removeChar(String input1, char letter) {
		//we need to loop thru string
		//we need to make comparison if statements
		//how do we remove the letter when found
		input1 = input1.toLowerCase();
		letter = Character.toLowerCase(letter);
		
		String newStr1 = "";

		for(int i=0; i<input1.length(); i++) {
			if (input1.charAt(i) != letter) {
				newStr1 = newStr1 + input1.charAt(i);
			}
		}
	return newStr1;
	}
	//#1
	public static char[] removeCharFromArray(char[] input1, char letter) {
		//we need to loop thru string
		//we need to make comparison if statements
		//how do we remove the letter when found

		letter = Character.toLowerCase(letter);
		String result = "";

		for(int i=0; i<input1.length; i++) {
			char lowerCaseLetters = Character.toLowerCase(input1[i]);
			if (letter != lowerCaseLetters) {
				result = result + input1[i];
			}
		}
	return result.toCharArray();
	}
	//#2 Write a method to remove duplicate characters from a string.
	public static String removeDuplicateChar(String word) {
		word = word.toLowerCase();
		String result = "";
		
		for(int i=0; i< word.length(); i++) {
			char outterLetter = word.charAt(i);	
			for(int j=0; j<word.length(); j++) {
				char innerLetter = word.charAt(j);
				if (i != j || word.length()-1 == j) {
					if (outterLetter == innerLetter
							&& word.length()-1 !=j) {
						break;
					} 
					if(word.length()-1 == j) {
						result += outterLetter;
					}
				}
			}
		}
	return result;
	}
	//#4 move the repeating characters to the end of word.8
	public static String moveRepeatingChar(String word) {
		word = word.toLowerCase();
		String newWord = "";
		String repeatedCh = "";

		for(int i=0; i< word.length(); i++) {
			char outerLetter = word.charAt(i);	
			for(int j=0; j<word.length(); j++) {
				char innerLetter = word.charAt(j);
				if (i != j || word.length()-1 == j) {
					if (outerLetter == innerLetter
							&& word.length()-1 !=j) {
						repeatedCh = repeatedCh + outerLetter;
						break;
					} 
					if(word.length()-1 == j) {
						newWord += outerLetter;
					}
				}
			}
		}
	newWord = newWord + repeatedCh;
	return newWord;
	}
	
	//#5 count 'a' in a string.
	public static int countA(String word) {
		word = word.toLowerCase();
		char[] wordArray = word.toCharArray();
		int CountOfA = 0;
		char ch = 'a';

		for(int i=0; i< word.length(); i++) {
			if (ch == wordArray[i]) {
				CountOfA++;
			}
		}
	return CountOfA;
	}
	//#6 remove white spaces in a string.
	public static String removeWhiteSpaces(String word) {
		word = word.toLowerCase();
		int leng = word.length();
		String newWord = "";
		char ch = ' ';

		System.out.println("#6 length: " + leng);
		for(int i=0; i< word.length(); i++) {
			if (ch != word.charAt(i)) {
				
				newWord = newWord + word.charAt(i);
			}
		}
	return newWord;
	}
	//#7 Write a method to find duplicate characters in a string.
	public static String findDuplicateChar(String word) {
		word = word.toLowerCase();
		String result = "";
		
		for(int i=0; i< word.length(); i++) {
			char outterLetter = word.charAt(i);	
			for(int j=0; j<word.length(); j++) {
				char innerLetter = word.charAt(j);
				if (i != j || word.length()-1 == j) {
					if (outterLetter == innerLetter
							&& word.length()-1 !=j) {
						result += outterLetter;
						break;
					}
				}
			}
		}
	return result;
	}
	
	//#8 Write a method to display the words in reverse order.
	public static String reverseWords(String words) {
/*
		//googled and it works using word splitter
		if (words == null || words.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] arr = words.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}		
*/
		int leng = words.length()-1;
		String buildWords = "";
		String reversed = "";
		char ch = ' ';

		//System.out.println("#6 length: " + leng);
		for(int i=leng; i>=0; i--) {
			//System.out.println(i);
			if (words.charAt(i) != ch) {
				buildWords = words.charAt(i) + buildWords;
				//System.out.println(buildWords);
				if (i==0) {
					reversed = reversed + ch +buildWords;
				}
			}else {
				reversed = reversed + ch + buildWords;
				buildWords = "";
			}
		}
	return reversed;
	}
	
}
