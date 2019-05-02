package weekThreeMyLibrary;

import java.util.Scanner;

public class Application {

private static Scanner input;

		public static void main(String[] args) {
			//VERSION 5  Tina
			input = new Scanner(System.in);

			Address address1 = new Address();
			Library library1 = new Library();
			Address address21 = new Address(321, "Boulevard", "Apt1", "Harrison", "New Jersey", "01234");
			Library library2 = new Library("Florissant Meadows Branch","314-222-2222",2,"Saint Louis County","B",address21);
			Address address3 = new Address();
			Library library3 = new Library();
			Address address5 = new Address();
			Library library5 = new Library();

			library1.setName("St. Louis County Library–Mid-County Branch");
			library1.setPhone("(314) 994-3300");
			library1.setBranchNum(101);
			library1.setAffiliation("St. Louis County");
			library1.setFacilityType("B");
			library1.setAddress(address1);
			address1.setStreetNumber(7821);
			address1.setStreetName("Maryland Ave.");
			address1.setStreetName2("");
			address1.setCity("St. Louis");
			address1.setState("MO");
			address1.setZip("63105");  

			library3.setName("Kingshighway Branch Library"); 
			library3.setPhone("(314) 771-5450");
			library3.setBranchNum(202);
			library3.setAffiliation("St. Louis");
			library3.setFacilityType("W");
			library3.setAddress(address3);
			address3.setStreetNumber(2260);
			address3.setStreetName("S Vandeventer Ave");
			address3.setStreetName2("");
			address3.setCity("St. Louis");
			address3.setState("MO");
			address3.setZip("63110");

			library5.setName("St Louis Public Library");
			library5.setPhone("(314) 367-4120"); 
			library5.setBranchNum(303);
			library5.setAffiliation("St. Louis");
			library5.setFacilityType("M");
			library5.setAddress(address5);
			address5.setStreetNumber(225);
			address5.setStreetName("N Euclid Ave");
			address5.setStreetName2("");
			address5.setCity("St. Louis");
			address5.setState("MO");
			address5.setZip("63108");

			System.out.println("Library: " + library1.getFacilityType()+library1.getBranchNum()+","+library1.getAffiliation()
			+","+library1.getName()+","+library1.getPhone()+","+address1.getStreetNumber()+address1.getStreetName()
			+address1.getStreetName2()+","+address1.getCity()+","+address1.getState()+","+address1.getZip());

			System.out.println("Library: " + library3.getFacilityType()+library3.getBranchNum()+","+library3.getAffiliation()
			+","+library3.getName()+","+library3.getPhone()+","+address3.getStreetNumber()+address3.getStreetName()
			+address3.getStreetName2()+","+address3.getCity()+","+address3.getState()+","+address3.getZip());

			System.out.println("Library: " + library5.getFacilityType()+library5.getBranchNum()+","+library5.getAffiliation()
			+","+library5.getName()+","+library5.getPhone()+","+address5.getStreetNumber()+address5.getStreetName()
			+address5.getStreetName2()+","+address5.getCity()+","+address5.getState()+","+address5.getZip());

			System.out.println("Library: " + library2.getFacilityType()  + library2.getBranchNum() + "," + library2.getAffiliation() 
			+ "," + library2.getName() + "," + library2.getPhone() + "," + address21.getStreetNumber() + " " + address21.getStreetName() 
			+ "," + address21.getStreetName2() + "," + address21.getCity() + "," + address21.getState() + "," + address21.getZip());
			
			Book book1 = new Book();
			Book book2 = new Book("N2", 220, 102, "How to Program", "Non-Fiction", "Arthor Person");
			Book book3 = new Book();
			Book book4 = new Book();
			Book book5=  new Book();
			Book book6 = new Book( 220, 102, "The graveyardBook", "Fiction" ,"author", "isbn");

			book1.setAuthor("Katylin Jenner");
			book1.setGenre("non-fiction");
			book1.setTitle("the Kardashians");
			book1.setIsbn("9997675");
			book1.setNumOfPages(788);
			book1.setBranchNum(898);

			 
			book3.setAuthor("Harper Lee");
			book3.setGenre("non-fiction");
			book3.setTitle("to kill a mocking bird");
			book3.setIsbn("0087675");
			book3.setNumOfPages(788);
			book3.setBranchNum(898);


			book4.setAuthor("Daveon Carson");
			book4.setGenre("fiction");
			book4.setIsbn("K56477");
			book4.setTitle("Matilda");
			book4.setBranchNum(563);
			book4.setNumOfPages(567);


			book5.setAuthor("Ashley Jones");
			book5.setGenre("fiction");
			book5.setIsbn("J96477");
			book5.setTitle("Moose");
			book5.setBranchNum(599);
			book5.setNumOfPages(878);


			//print for books
			System.out.println("Book: " + book1.getIsbn() + "," + book1.getNumOfPages() + "," + book1.getBranchNum()
			+ "," + book1.getTitle() + "," + book1.getGenre() + "," + book1.getAuthor());

			System.out.println("Book: " + book2.getIsbn() + "," + book2.getNumOfPages() + "," + book2.getBranchNum()
			+ "," + book2.getTitle() + "," + book2.getGenre() + "," + book2.getAuthor());

			System.out.println("Book: " + book3.getIsbn() + "," + book3.getNumOfPages() + "," + book3.getBranchNum()
			+ "," + book3.getTitle() + "," + book3.getGenre() + "," + book3.getAuthor());

			System.out.println("Book: " + book4.getIsbn() + "," + book4.getNumOfPages() + "," + book4.getBranchNum()
			+ "," + book4.getTitle() + "," + book4.getGenre() + "," + book4.getAuthor());

			System.out.println("Book: " + book5.getIsbn() + "," + book5.getNumOfPages() + "," + book5.getBranchNum()
			+ "," + book5.getTitle() + "," + book5.getGenre() + "," + book5.getAuthor());
			
			System.out.println("Book: " + book6.getIsbn() + "," + book6.getNumOfPages() + "," + book6.getBranchNum()
			+ "," + book6.getTitle() + "," + book6.getGenre() + "," + book6.getAuthor());
			
			
//*********************************************************************			
			Address address011 = new Address();
			Customer customer01 = new Customer();
			Customer customer03 = new Customer();
			
			Address address021 = new Address(321, "Boulevard", "Apt1", "Harrison", "New Jersey", "01234");
			Customer customer02 = new Customer(02,"Mary","Brown", 29, "314-229-4111", address021, "tomorrow265@hotmail.com", 0.0);
			
			System.out.println("Cust: " + customer02.getCustomerNumber() + "," + customer02.getFirstName() + "," + customer02.getLastName()
				+ "," + customer02.getAge() + "," + customer02.getTelephone() + "," + customer02.getEmail() + "," + customer02.getAmountDue() 
				+ "," + address021.getStreetNumber() + "," + address021.getStreetName() + "," + address021.getStreetName2()
				+ "," + address021.getCity() + "," + address021.getState() + "," + address021.getZip());
			 
			address011.setStreetNumber(111);
			address011.setStreetName("Main");
			address011.setStreetName2("B");
			address011.setCity("Nashville");
			address011.setState("Maryland");
			address011.setZip("11133");
			customer01.setAddress(address011);
			customer01.setCustomerNumber(01); 
			customer01.setFirstName("Kyle"); 
			customer01.setLastName("Smith"); 
			customer01.setAge(22);
			customer01.setTelephone("314-481-3333");
			customer01.setEmail("tomorrow265@hotmail.com");
			customer01.setAmountDue(0.0);
			
			System.out.println("Cust: " + customer01.getCustomerNumber() + "," + customer01.getFirstName() + "," + customer01.getLastName()
			+ "," + customer01.getAge() + "," + customer01.getTelephone() + "," + customer01.getEmail() + "," + customer01.getAmountDue()
			+ address011.getStreetNumber() + "," + address011.getStreetName() + "," + address011.getStreetName2()
			+ "," + address011.getCity() + "," + address011.getState() + "," + address011.getZip());
			
			
			library2.getCustomers().add(customer01);
			library2.getCustomers().add(customer02);
			
			//int numberOfCust = 0;
			int countCustomers =  0; 
			
			//Display all customers in the Library		
			for(int i=0; i < library2.getCustomers().size(); i++)  {
				System.out.println(library2.getName() + "," + library2.getCustomers().get(i));
				countCustomers++;
			}
	
			System.out.println("Customers: " + countCustomers);
			
			library2.getBooks().add(book1);
			library2.getBooks().add(book2);
			library2.getBooks().add(book3);
			library2.getBooks().add(book4);
			library2.getBooks().add(book5);
			library2.getBooks().add(book6);
			
			//Get count of books from the library
			System.out.println("Books: " + library2.getBookCount());
			
			System.out.println("Would you like to add a new customer to a library? ");
			String newCustYesNo = input.nextLine();
			newCustYesNo = newCustYesNo.toLowerCase();
			System.out.println(newCustYesNo);
			
			//ArrayList<Customer> customers result = addNewCust(String newCustYesNo);
			//int[] sourceArray={2, 3, 1, 5, 10};
			//int[] targetArray=new int[sourceArray.length];
			//for (int i = 0; i < sourceArray.length; i++)
			//targetArray[i] = sourceArray[i];
			
			if (newCustYesNo.contentEquals("yes") || newCustYesNo.contentEquals("y")) {
				System.out.println("First Name: ");
				customer03.setFirstName(input.nextLine());
				System.out.println("First Name: " + customer03.getFirstName());
			}
		}
}
