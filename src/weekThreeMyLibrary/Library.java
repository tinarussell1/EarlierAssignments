package weekThreeMyLibrary;

import java.util.ArrayList;

public class Library {

	//These are the fields.  ie.. attributes of the class => 'Library'
	private String name;
	private String phone;
	private int branchNum;
	private String affiliation;
	private String facilityType;
	private  Address address;	
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public Library() 
	{
	}
	
	public Library(String name, String phone, int branchNum, String affiliation, 
	String facilityType, Address address) 
	{	
	// ^^^This is a paramaterized Constructor
	this.name = name;
	this.phone = phone;
	this.branchNum = branchNum;
	this.affiliation = affiliation;
	this.facilityType = facilityType;
	this.address = address;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getPhone() {
	return phone;
	}
	public void setPhone(String phone) {
	this.phone = phone;
	}
	public int getBranchNum() {
	return branchNum;
	}
	public void setBranchNum(int branchNum) {
	this.branchNum = branchNum;
	}
	public String getAffiliation() {
	return affiliation;
	}
	public void setAffiliation(String affiliation) {
	this.affiliation = affiliation;
	}
	public String getFacilityType() {
	return facilityType;
	}
	public void setFacilityType(String facilityType) {
	this.facilityType = facilityType;
	}
	public Address getAddress() {
	return address;
	}
	public void setAddress(Address address) {
	this.address = address;
	}
	public ArrayList<Book> getBooks() {
	return books;
	}
	public void setBooks(ArrayList<Book> books) {
	this.books = books;
	}
	public ArrayList<Customer> getCustomers() {
	return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
	this.customers = customers;
	}
	
	public int getCustCount() {
		return this.customers.size();
	}

	public int getBookCount() {
		return this.books.size();
	}

}
