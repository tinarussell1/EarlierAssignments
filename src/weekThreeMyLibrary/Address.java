package weekThreeMyLibrary;

public class Address {
	private int streetNumber;
	private String streetName;
	private String streetName2;
	private String city;
	private String state;
	private String zip;
	
	public Address() {
		
	}
	public Address(int streetNumber, String streetName, String streetName2, String city, String state, String zip) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetName2 = streetName2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public int getStreetNumber() {
		return this.streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return this.streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}	
	public String getStreetName2() {
		return this.streetName2;
	}
	public void setStreetName2(String streetName2) {
		this.streetName2 = streetName2;
	}	
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", streetName=" + streetName + ", streetName2=" + streetName2
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	

}
