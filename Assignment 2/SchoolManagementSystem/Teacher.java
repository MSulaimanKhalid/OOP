public class Teacher extends Person{

	private String subject;
	private int id;
	int idCounter = 1;
	
	Teacher (String name, int age, String subject){

		this.setName(name);
		this.setAge(age);
		this.subject = subject;
		this.id = idCounter++;

	}
	
	boolean equals(Teacher test){

		if(this.id == test.id){
			return true;
		}
		
		return false;

	}

	public String toString(){

		return String.format("Teacher name: %s\nid: %03d\nage: %d\nsubject: %s\n", this.getName(),id,getAge(),subject);
	
	}

	void setSubject (String subject){
		this.subject = subject;
	}

	String getSubject (){
		return subject;
	}

	int getId(){
		return id;
	}


}