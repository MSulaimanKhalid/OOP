public class Lab{

	private String name;
	private Employee labStaff;
	private SystemUnit [] systems = new SystemUnit[50];
	private boolean hasMultiMedia;

	Lab(String name, Employee labStaff, SystemUnit [] systemsTaken,boolean hasMultiMedia){

		this.name = name;
		this.labStaff.setName(labStaff.getName());
		this.labStaff.setDesignation(labStaff.getDesignation());
		this.hasMultiMedia = hasMultiMedia;
		
		for(int i=0; i<systemsTaken.length; i++){
		
			this.systems[i] = new SystemUnit (systemsTaken[i].getCpuName(), systemsTaken[i].getRamSize(), systemsTaken[i].getDiskSize(), systemsTaken[i].getSystemId(), systemsTaken[i].getLcdModel());

		}

	}

	public String getName(){
		return name;
	}	
	
	public Employee getLabStaff(){
		return labStaff;
	}

	public SystemUnit [] getSystems(){
		return systems;
	}

	public boolean getHasMultiMedia(){

		return hasMultiMedia;

	}

	public String toString(){

		String s;

		StringBuilder sb = new StringBuilder();

		sb.append("LAB NAME: ").append(name).append("\nHas MultiMedia: ").append(hasMultiMedia).append("\nLab incharge: ").append(this.labStaff.getName()).append("\nSYSTEM DETAILS; \n");

		for (int i=0; i<systems.length; i++){

			sb.append(systems[i].toString()).append("\n");

		}

		s = sb.toString();

		return s;

	}

}