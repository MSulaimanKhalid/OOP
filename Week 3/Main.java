import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		boolean exit=false;
		
		String username,password;
		StudentInfo s1=new StudentInfo("Muhammad Sulaiman Khalid", "EME", 3.22);
		StudentInfo s2=new StudentInfo("Taha Nadeem", "Sabzazar", 3.42);
		StudentInfo s3=new StudentInfo("Muhammad Saad", "LDA", 3.77);
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter username: ");
		username=input.next();

	
		if (username.equals(Login.getUsername())){

			Scanner input1=new Scanner(System.in);
			System.out.print("Enter password: ");
			password=input1.next();
				
			if(password.equals(Login.getPassword())){
		
			System.out.printf("Student 1:\n%5s%18s%10s%15.02f\n",s1.getName(),s1.getId(),s1.getAddress(),s1.getGpa());
			System.out.printf("Student 2:\n%5s%31s%15s%10.02f\n",s2.getName(),s2.getId(),s2.getAddress(),s2.getGpa());
			System.out.printf("Student 3:\n%5s%29s%10s%15.02f\n",s3.getName(),s3.getId(),s3.getAddress(),s3.getGpa());
			exit=true;
			}
			else{
				System.out.print("Invalid Password!");
			
			}
		}
		else {
			System.out.print("Invalid Username!");
	
		}

		
	}
}