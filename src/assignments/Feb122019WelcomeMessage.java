package assignments;

public class Feb122019WelcomeMessage {
		
	public static void main(String[] args) {
		System.out.println("Starting Welcome message");
		
		//Declaring the variable
		String name;
			
		//Define the variable
		name = "Tina";
			
		//Declare & Define variable
		String date = "Friday, 3:12pm";
		double transactionAmount = 112.05;
		char sign = '-';
			
		//Use the variable
		System.out.println(name);
		System.out.println(date);
		System.out.println(transactionAmount);
			
		//Print message
		System.out.println("Hi " + name + ", welcome back! Your last login was " + date + ". Your last transaction was for " + sign + "$" + transactionAmount + ".");
		// "Hi, Shawn, welcome back! Your last login was Friday, 2:12pm. Your last transaction was for $32.58.
			
	}

}
