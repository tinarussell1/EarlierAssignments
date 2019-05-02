package assignments;
import java.util.Scanner;

public class Jan302019IsFactor {

	private static Scanner input;

	public static void main(String[] args) {
			
		input = new Scanner(System.in);

		//get true if of 2 integers, one factors into the other.
		System.out.println("Enter two integers to factor: ");
		int k = input.nextInt();
		int n = input.nextInt();
				
		boolean result = isFactor(k, n);
		System.out.println("Integer " + n + " is a factor " + k + " if result true: " + result);		

	}
		
	// true if one variable is true, if both true then false or if false if both false.
	public static boolean isFactor(int k, int n) {
		boolean x = false;
		if ((k % n) == 0) {
			x = true;				
		}
		return x;
	}	
}	
		

