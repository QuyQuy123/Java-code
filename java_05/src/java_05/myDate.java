package java_05;

public class myDate {
	private int day;
	private int month;
	private int year;

	public myDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public void printDay() {
		System.out.println("Day:"+this.day);
}
	public void printMonth() {
		System.out.println("Month:"+this.month);
	}
	public void printYear() {
		System.out.println("Year:"+this.year);
	}	
	public void printDate() {
		System.out.println("Date:"+ this.day+"-"+this.month+"-"+this.year);		
	}
}
	

	
	
	
	
	
	