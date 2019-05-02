package assignments;

import java.util.Scanner;

public class Jan252019RemoveMiddle {

	private static Scanner input;

	public static void main(String[] args) {	
		input = new Scanner(System.in);	
		
		//Friday Assignment #4, remove middle character is length odd 
		//and remove middle two characters if length is even, eg input "stack" output:"stck", input "banana" output: "bana" .
		System.out.println("Enter a string to remove middle character or characters.");				

		String str4 = input.nextLine();
		
		String newStr4 = removeMid(str4);
		System.out.println("newString: " + newStr4);
	}
	public static String removeMid(String input) {
		
		//Friday Assignment #4, remove middle character is length odd 
		//and remove middle two characters if length is even, 
		//eg input "stack" output:"stck", input "banana" output: "bana" .
		//CASE 1 stack => 5 => stck length /2
		//CASE 2 banana => 6 => bana length /2 and (length/2) -1
		//        012345
		
		String result = "";
		int middle = input.length() /2;
	
		//CASE 1 ODD length
		if(input.length() %2 !=0) {
			result = input.substring(0,middle)
					+ input.substring(middle+1);
		}
		else {
			//CASE 2 even length
			result = input.substring(0,middle-1)
					+ input.substring(middle+1);
		}

		return result;
	}	
}



