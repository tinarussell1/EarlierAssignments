package assignments;

import java.util.Scanner;

public class Jan242019CircleAreaCircumference {

	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		
		//Thurs Assignment #1, prompt the user to enter the radius of the circle
		//then calculate the area and circumference of the circle.
		System.out.println("Please enter the radius of the circle:");

		int radius = input.nextInt();
		
		int area = calcArea(radius);
		System.out.println("The area of the circle is: " + area);	
		
		int circumference = calcCircumference(radius);
		System.out.println("The circumference of the circle is: " + circumference);	
		
		input.close();
	}
	
		public static int calcArea(int radius) {
			//Area = PI*radius*radius
			int area = (int) (Math.PI * (radius * radius));
			return area;	
		}
		public static int calcCircumference(int radius) {
			//Circumference = 2*PI*radius
			int circumference = (int) (Math.PI * 2*radius);
			return circumference;			
		}
	
}
