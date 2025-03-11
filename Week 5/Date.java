public class Date {

	private int day;
	private int month;
	private int year;


	Date (int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;

	}
	
	Date (Date other){
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;

	}
	
	public void showDate(){
		System.out.println(day + "-" + month + "-" + year);
	}

	int getDay (){
		return day;
	}

	int getMonth (){
		return month;
	}

	int getYear (){
		return year;
	}

	void setDay (int day) {
		this.day = day;
	}

	void setMonth (int month) {
		this.month = month;
	}

	void setYear (int year) {
		this.year = year;
	}

}