package assignments;

import java.util.Scanner;

public class Jan252019EveryOtherUppercase {

	private static Scanner input;

	public static void main(String[] args) {	
		input = new Scanner(System.in);	

		//Friday Assignment #2, every other letter in 
		//string is uppercase/lowercase ex.bAnAnA or sTlOuIs.
		System.out.println("Enter a string change case.");				

		String Str = input.nextLine();
		String newstr = "";
		
		for (int i =0; i<Str.length(); i++)
		{
			if (i% 2 == 0)
			{
				newstr += Str.toLowerCase().charAt(i);
			}
			else
			{
				newstr += Str.toUpperCase().charAt(i);
			}
		}
		System.out.println("newstr: " + newstr);	
		
	}
	
}

