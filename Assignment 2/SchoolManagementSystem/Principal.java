public class Principal extends Person{

	private int experience;
	
	Principal (String name, int age, int experience){

		this.setName(name);
		this.setAge(age);
		this.experience = experience;

	}
	
	

	public String toString(){

		return String.format("Principal name: %s\nage: %d\nyears of experience: %d years\n", getName(),getAge(),experience);
	
	}

	void setExperience (int experience){
		this.experience = experience;
	}

	int getExperience (){
		return experience;
	}

}