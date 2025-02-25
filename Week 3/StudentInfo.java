public class StudentInfo{
	private static String preid="FA24-BCS-";
	private String name,address,id;
	private double gpa;
	private static int roll=1;


	StudentInfo(String n,String a,double g){
		name=n;
		address=a;
		gpa=g;
		id=String.format("%s%03d",preid,roll);
		roll++;
	}


	String getName(){
		return name;
	}

	String getAddress(){
		return address;
	}

	String getId(){
		return id;
	}

	double getGpa(){
		return gpa;
	}
}
