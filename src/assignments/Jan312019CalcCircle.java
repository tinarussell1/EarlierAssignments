package assignments;

import java.util.Scanner;

public class Jan312019CalcCircle {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");

		int radius = input.nextInt();
		//Area = PI*radius*radius
		Double area = Math.PI * (radius * radius);
		int intArea = area.intValue();
	
		//Circumference = 2*PI*radius
		Double circumference = Math.PI * 2*radius;
		int intCircumference = circumference.intValue();
		
		System.out.println("The area of the circle is: " + intArea);
		System.out.println("The circumference of the circle is: " + intCircumference);
		
		input.close();
					
	}

}