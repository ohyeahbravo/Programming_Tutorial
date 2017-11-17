import java.util.ArrayList;


public class Student {
	private String name;
	private int matrNr;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the student a name and a matriculation number
	public Student() {}
	
	public Student(String str, int value) {
		name = str;
		matrNr = value;
	}
	
	//todo: write getter and setter methods
	public String getName() {
		return name;
	}
	
	public int getMatrNr() {
		return matrNr;
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public void setMatrNr(int value) {
		matrNr = value;
	}
	
	public void addLecture(String lecture){
		//todo: fill this method
		lectures.add(lecture);
	}
	
	public void printLectures() {
		System.out.println(lectures);
	}
}
