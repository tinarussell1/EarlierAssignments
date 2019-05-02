package assignments;

import java.util.Scanner;

public class Feb132019IsPerfect {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		//get true if is a perfect number.
		System.out.println();
		System.out.println("Enter an integer to determine if it is a perfect number: ");
		int num3 = input.nextInt();
			
		boolean resultP = isPerfect(num3);
		System.out.println("Integer " + num3 + " is a perfect number if result true: " + resultP);		
		
		input.close();
}
		// determine if the number is a perfect number.
		public static boolean isPerfect(int n3) {
		
			boolean x = false;
			int count = 0;
			for(int i=1;i<n3;i++) {
	//			System.out.println("temp= " +temp);
	//			System.out.println("i= " + i);
	//			System.out.println("n3= " +n3);
				if(Jan302019IsFactor.isFactor(n3,i)) {
					count = count + i;
				}
			}
			if (count == n3) {
			x = true;				
			}
			return x;
	}
}	