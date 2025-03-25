public class Student extends Person{

	private int roll_no;
	int roll_noCounter = 1;
	
	Student (String name, int age){

		this.setName(name);
		this.setAge(age);
		this.roll_no = roll_noCounter++;

	}

	Student  (String name, int age, int roll_no){

		this.setName(name);
		this.setAge(age);
		this.roll_no = roll_no;

	}
	
	boolean equals(Student test){

		if(this.roll_no == test.roll_no){
			return true;
		}
		
		return false;

	}

	public String toString(){

		return String.format("Student name: %s\nroll no.: %03d\nage: %d\n", getName(),roll_no,getAge());
	
	}

	int getRoll_no (){
		return roll_no;
	}

}