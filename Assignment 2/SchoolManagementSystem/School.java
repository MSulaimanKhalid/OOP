public class School{

	private String name;
	private String address;
	private Principal principal;
	private ClassRoom [] classrooms;

	School (String name, String address, String principalName, int age, int experience){

		this.name = name;
		this.address = address;
		this.principal = new Principal(principalName, age, experience);
		classrooms = new ClassRoom[2];

	}

	void addClass(ClassRoom c){

		int counter = 0;

		if (counter<classrooms.length){
			classrooms[counter++] = new ClassRoom(c.getName(), c.getClassCode(), c.teacher, c.students);
		}
		else{
			System.out.println("All the classrooms in this school have been occupied!");
		}

	}

	public String toString() {
    		StringBuilder sb = new StringBuilder();

  		sb.append("School Name: ")
		.append(name)
		.append("\nAddress: ")
		.append(address)
    		.append("\nPrincipal: ")
		.append(principal.toString())
      		.append("\nClassrooms details;\n");

    		for (int i=0; i<classrooms.length; i++) {
            		sb.append(classrooms[i].toString()).append("\n");
        	}

    		return sb.toString();
	}

}