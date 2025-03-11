public class Address {

	private String street;
	private String city;

	Address (String street, String city){
		this.street=street;
		this.city=city;
	}
	
	Adress (Adress other){
		this.street = other.street;
		this.city = other.city;
	}
	
	public void showAddress(){
		System.out.println(street + ", " + city);
	}

	String getStreet (){
		return street;
	}

	String getCity (){
		return city;
	}

	void setStreet (String street) {
		this.street = street;
	}

	void setCity (String city) {
		this.city = city;
	}
}