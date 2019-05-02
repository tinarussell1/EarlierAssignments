package assignments;
import java.util.Scanner;

public class Jan312019WorkingNumbersPrimeMinMaxMedianBooleanFactor {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Tina");
		//Write a method called "max3" that computes the maximum value of THREE integers.
		
		input = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int v3 = input.nextInt();
		//get max of 5,15,90
		int maxResult = max3(v1,v2,v3);
		System.out.println("The max number is: " + maxResult);

		//get min of 5,15,90
		int minimumResult = min3(v1,v2,v3);
		System.out.println("The minimum number is: " + minimumResult);

		//get median of 5,15,90
		int medianResult = median3(maxResult, minimumResult, v1,v2,v3);
		System.out.println("The median number is: " + medianResult);

		//get true if only one of two values is true
		input.nextLine();
		System.out.println();
		System.out.println("Enter whether the first boolean is true or false. ");
		boolean trueFalse1 = input.nextBoolean();
		System.out.println("Enter whether the second boolean is true or false. ");
		boolean trueFalse2 = input.nextBoolean();
		
		boolean trueOrFalseResult = xor(trueFalse1, trueFalse2);
		System.out.println("The eXclusive true is: " + trueOrFalseResult);
		
		//get true if of 2 integers, one factors into the other.
		System.out.println("Enter two integers to factor: ");
		int k = input.nextInt();
		int n = input.nextInt();
				
		boolean result = isFactor(k, n);
		System.out.println("Integer " + n + " is a factor " + k + " if result true: " + result);		

		//get true if is a perfect number.		
		System.out.println();
		System.out.println("Enter an integer to determine if it is a perfect number: ");
		int num3 = input.nextInt();
			
		boolean resultP = isPerfect(num3);
		System.out.println("Integer " + num3 + " is a perfect number if result true: " + resultP);		

		//get true if is a prime number.		
		System.out.println();
		System.out.println("Enter an integer to determine if it is a prime number: ");

		int z = input.nextInt();
		if (isPrime(z)) {
			System.out.println(" true");
		} else {
			System.out.println(" false");
		}
	}
		// 5, 15, 90 ==> Max 90
		public static int max3(int valueOne, int valueTwo, int valueThree) {
			int max = valueOne;
			if(valueTwo > max) {
				max = valueTwo;
			}
			if(valueThree > max) {
				max = valueThree;
			}
			return max;
		}	
			// 5, 15, 90 ==> Minimum 5
		public static int min3(int valueOne, int valueTwo, int valueThree) {
			int minimum = valueOne;
			if(valueTwo < minimum) {
				minimum = valueTwo;
			}
			if(valueThree < minimum) {
				minimum = valueThree;
			}
			return minimum;
		}		
			// 5, 15, 90 ==> Median 15
		public static int median3(int min, int max, int valueOne, int valueTwo, int valueThree) {
	 		int total = (valueOne + valueTwo + valueThree);
			double median = (total - min - max);
			
/*	 //The way to figure median with a range of several numbers and
     //min/max not already calculated.
 		int array[] = {valueOne, valueTwo, valueThree};
			Arrays.sort(array);
			
			for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
			System.out.println();
			
			if (array.length % 2 == 0) {
				median = ((double)array[array.length/2] + (double)array [array.length/2 - 1])/2;
			}
				else {
				median = (double) array[array.length/2];
			}
*/
			return (int) median;
	}
	
		// true if one variable is true, if both true then false or if false if both false.
		public static boolean xor(boolean b1, boolean b2) {
			boolean x = false;
			if(b1) {
				if(!b2) {
					x = true;				
				}
			}
			if(b2) {
				if(!b1) {
					x = true;				
				}
			}
			return x;
		}	
		
		// true if one integer is a factor of the integer or false.
		public static boolean isFactor(int k, int n) {
			boolean x = false;
			if ((k % n) == 0) {
				x = true;				
			}
			return x;
		}			

		// determine if the number is a perfect number.
		public static boolean isPerfect(int n3) {
		
			boolean x = false;
			int count = 0;
			for(int i=1;i<n3;i++) {
		//		System.out.println("i= " + i);
		//		System.out.println("n3= " +n3);
				if(isFactor(n3,i)) {
					count = count + i;
		//			//System.out.println("count= " +count);
				}
			}
			if (count == n3) {
			x = true;				
			}
			return x;
		}	
		
		// determine if the number is a prime number.
		public static boolean isPrime(int n4) {
		
			if (n4 <= 1) {
				return false;
			}
			for(int i=2;i<n4;i++) {
		//		System.out.println("i= " + i);
		//		System.out.println("n4= " +n4);
		//		if(isFactor(n4,i)) {
				if (n4 % i == 0) {
					//number is perfectly divisible - no prime
					return false;
				}
			}
			return true;
		}		
/*	
		// determine if the number is a prime number.
		public static boolean isPrimeNumber(int n4) {
			if (n4 == 2 || n4 == 3) {
				return true;
			}
			if (n4 % 2 == 0) {
				return false;
			}
			int sqrt = (int) Math.sqrt(n4) + 1;
			for(int i=3;i<sqrt;i+= 2) {
		//		System.out.println("i= " + i);
		//		System.out.println("n4= " +n4);
		//		if(isFactor(n4,i)) {
				if (n4 % i == 0) {
					//number is perfectly divisible - no prime
					return false;
				}
			}
			return true;
		}		

		// determine if the number is a prime number.
		public static String isPrimeOrNot(int n4) {
			if (n4 < 0) {
				return  "not valid";
			}
			if (n4 == 0 || n4 ==1) {
				return "not prime";
			}
			if (n4 == 2 || n4 == 3) {
				return "prime number";
			}
			if ((n4 * n4 - 1) % 24 == 0) {
				return "prime";
			} else {
				return "not prime";
			}
		}		
*/		
}	
	



