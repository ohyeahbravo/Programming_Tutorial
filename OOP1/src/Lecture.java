
public class Lecture {
	private String name;
	private double credits;
	
	//todo: write a constructor which already takes a name and credits
	public Lecture() {}
	
	public Lecture(String str, double value) {
		name = str;
		credits = value;
	}
	
	//todo: write getter and setter methods
	public String getName() {
		return name;
	}
	
	public double getCredits() {
		return credits;
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public void setCredits(double value) {
		credits = value;
	}

}
