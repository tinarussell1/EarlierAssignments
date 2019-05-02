package jan312019studentLabWritingToFileSave;

import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		
		Address address = new Address();
		Student student = new Student();
		student.setFirstName("Tina");
		student.setLastName("Russell");
		student.setEmail("tomorrow265@hotmail.com");
		student.setGpa(1.4);
		student.setAge(11);
		

		student.setAddress(address);
		address.setStreet("233 Alma Drive");
   		address.setCity("Hazelwood");
   		address.setState("MO");
   		address.setZip("63042");

	
		student.saveToFile();
		
		Student studentFromFile = Student.readFromFile("tomorrow265@hotmail.com");
		System.out.println(studentFromFile);
		
		Scanner input = new Scanner (System.in);
/*
		System.out.println("Please enter an age for this person: ");
        String inputValue = input.next();
        
        validateAge(inputValue);
*/
		input.close();
	}

	private static void validateAge(String inputValue) {

		try {
			int age = Integer.parseInt(inputValue);
			System.out.println("Thank you for your input!!");
		} 
		catch (NumberFormatException ex) {
			System.out.println("Invalid number, please try again: ");
			Scanner input = new Scanner (System.in);
			String value = input.next();
			validateAge(value);
			input.close();
		}

 	}
}
