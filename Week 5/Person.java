public class Person {

	private String name;
	private String role;
	private Address address;

	Person (String name, String role, Address address){
		this.name = name;
		this.role = role;
		this.address = new Address(address);
	}

	Person (Person other){
		this.name = other.name;
		this.role = other.role;
		this.address = new Address(other.address);
	}

	public void showPersonDetails (){
		 System.out.println("Name: " + name + ", Role: " + role);
      	  	 address.showAddress();
	}

	public String getName(){
		return name;
	}

	public String getRole(){
		return role;
	}
	
	public void setName (String name){
		this.name = name;
	}

	public void setRole (String role){
		this.role = role;
	}	

}