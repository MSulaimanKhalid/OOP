public class ClassRoom{

	private String name;
	private String classCode;
	Teacher teacher;
	Student [] students = new Student[5];

	ClassRoom(String name, String classCode){

		this.name = name;
		this.classCode = classCode;

	}

	ClassRoom(String name, String classCode, Teacher teacher, Student [] students){

		this.name = name;
		this.classCode = classCode;
		this.teacher = teacher;
		students = new Student[5];
		
		for (int i=0; i<students.length; i++){

			this.students[i] = students[i];

		}

	}

	void setTeacher (Teacher t){

		this.teacher = t;

	}

	void addStudent(Student s){

		int counter = 0;
		
		if(counter<students.length){
		students[counter++] = new Student(s.getName(),s.getAge(),s.getRoll_no());
		}
		else{
			System.out.println("No vacant seat available for students!");
		}	

	}

	public String toString(){

		StringBuilder sb = new StringBuilder();

       	sb.append("Class Name: ")
		.append(name)
          	.append("\nClass code: ")
		.append(classCode)
		.append("\nTeacher: ")
		.append(teacher.getName())
		.append("\nStudents details;\n");

        	for (int i = 0; i < students.length; i++) {
            		sb.append(students[i].toString()).append("\n");
        	}
        	
		return sb.toString();

	}

	void setName (String name){
		this.name = name;
	}

	String getName (){
		return name;
	}

	void setClassCode (String classCode){
		this.classCode = classCode;
	}

	String getClassCode (){
		return classCode;
	}
}