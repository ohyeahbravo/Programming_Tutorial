
class Date {
	
	public int year;
	public int month;
	public int day;
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return String.valueOf(year) + '/' + String.valueOf(month) + '/' + String.valueOf(day);
	}
	
}