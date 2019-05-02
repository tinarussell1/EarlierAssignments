package jan312019studentLabWritingToFileSave;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private double gpa;
	private int age;
	private Address address ;
	//= new Address();
	private static final String path = "C:\\Users\\Tina\\Documents\\JavaFullstackBootcamp\\streams\\";
	
	public Student() {
	}
	
	public Student(String firstName, String lastName, String email, double gpa, int age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gpa = gpa;
		this.age = age;
		this.address = address;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getGpa() {
		return this.gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public static Student readFromFile(String email) {
		Address address = new Address();
		Student student = new Student();
		String fileName = path + email + ".txt";
		
		try {
			Scanner scanner = new Scanner (new File(fileName));
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parsedLine = line.split(",");
				
				student.firstName = parsedLine[0];
				student.lastName = parsedLine[1];
				student.email = parsedLine[2];
				student.gpa = Double.parseDouble(parsedLine[3]);
				student.age = Integer.parseInt(parsedLine[4]);
				
		   		student.setAddress(address);
		   		address.setStreet(parsedLine[5]);
		   		address.setCity(parsedLine[6]);
		   		address.setState(parsedLine[7]);
		   		address.setZip(parsedLine[8]);

			}
			} catch(FileNotFoundException ex) {
			
			}
		return student;
	}
	
	public void saveToFile() {
		try {
		String fileName = this.path + this.email + ".txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(this.toString());
			bw.close();
		}catch(IOException ex) {
		
		}
	}
	
	@Override
	public String toString() {
		return   this.firstName+","+this.lastName+","+this.email+","
				+this.gpa+","+this.age+","+this.address;
	}
	
	
	
}
