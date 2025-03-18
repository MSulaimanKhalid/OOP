public class SystemUnit {

	private String cpuName;
	private int ramSize;
	private int diskSize;
	private String systemId;
	private String lcdModel;

	int idCounter=0;

	SystemUnit(String cpuName, int ramSize, int diskSize, String systemId, String lcdModel){

		this.cpuName = cpuName;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.lcdModel = lcdModel;

		this.systemId = String.format("C%03s",idCounter++);

	}

	public String getCpuName(){
		return cpuName;
	}
	
	public int getRamSize(){
		return ramSize;
	}

	public int getDiskSize(){
		return diskSize;
	}

	public String getSystemId(){
		return systemId;
	}

	public String getLcdModel(){
		return lcdModel;
	}

	public String toString(){
		
		return String.format("DETAILS OF COMPUTER %s \nCpu name: %s\n Ram size: %d \n Disk size: %d \n LCD Model: %s\n",systemId,cpuName,ramSize,diskSize,lcdModel);

	}

}