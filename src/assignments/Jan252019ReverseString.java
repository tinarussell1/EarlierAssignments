package assignments;

import java.util.Scanner;

public class Jan252019ReverseString {

	private static Scanner input;

	public static void main(String[] args) {	
		input = new Scanner(System.in);	
		//Friday Assignment #3, reverse character order, eg input "Java" output "avaJ".
		System.out.println("Enter a string to reverse.");				

		String Str3 = input.nextLine();
		String newRevStr = "";
		int positionStart = Str3.length();
		positionStart = positionStart - 1;
		
		for (int i=positionStart; i>=0; i--)
		{
			newRevStr = newRevStr + Str3.charAt(i);
		}
		System.out.println("newReversedstr: " + newRevStr);

	}
}
