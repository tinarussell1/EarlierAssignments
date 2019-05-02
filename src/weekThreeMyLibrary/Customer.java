package weekThreeMyLibrary;

import weekThreeMyLibrary.Address;

public class Customer {
		private int customerNumber;
		private String firstName;
		private String lastName;
		private int age;
		private String telephone;
		private Address address;
		private String email;
		private double amountDue;
		
		public Customer() {
		}
		public Customer(int customerNumber, String firstName, String lastName, int age, String telephone, Address address, String email, double amountDue) {
			this.customerNumber = customerNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.telephone = telephone;
			this.address = address;
			this.email = email;
			this.amountDue = amountDue;
			//this.booksCheckedOut = booksCheckedOut;
		}
		public int getCustomerNumber() {
			return this.customerNumber;
		}
		public void setCustomerNumber(int customerNumber) {
			this.customerNumber = customerNumber;
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
		public String getTelephone() {
			return this.telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public Address getAddress() {
			return this.address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getAmountDue() {
			return this.amountDue;
		}
		public void setAmountDue(double amountDue) {
			this.amountDue = amountDue;
		}
/*
		public Book[] getBooksCheckedOut() {
			return this.booksCheckedOut;
		}
		public void setBooksCheckedOut(Book[] booksCheckedOut) {
			this.booksCheckedOut = booksCheckedOut;
		}
*/
		@Override
		public String toString() {
			return "Customer [customerNumber=" + customerNumber + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", age=" + age + ", telephone=" + telephone + ", address=" + address + ", email=" + email
					+ ", amountDue=" + amountDue + "]";
		}
		
		
	
}
