import java.util.ArrayList;


public class Professor {
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the professor a name and a chair
	public Professor() {}
	
	public Professor(String str1, String str2) {
		name = str1;
		chair = str2;
	}
	
	//todo: write getter and setter methods
	public String getName() {
		return name;
	}
	
	public String getChair() {
		return chair;
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public void setChair(String str) {
		chair = str;
	}
	
	public void addLecture(String lecture){
		//todo: fill this method
		lectures.add(lecture);
	}
	
	public void printLectures() {
		System.out.println(lectures);
	}
}
