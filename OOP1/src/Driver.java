
public class Driver {

	public static void main(String[] args) {
		
		Student student = new Student("Hiyeon Kim", 118654);
		Professor professor = new Professor("Florian Echtler", "Mobile Media");
		Lecture lecture = new Lecture("Software Engineering", 4.5);
		Lecture lecture2 = new Lecture("Computer Graphics", 4.5);
		
		student.addLecture(lecture.getName());
		student.addLecture(lecture2.getName());;
		professor.addLecture(lecture.getName());
		
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Matriculation Number: " + student.getMatrNr());
		System.out.print("Lectures of this student: ");
		student.printLectures();
		System.out.println("Professor Name: " + professor.getName());
		System.out.println("Professor Chair: " + professor.getChair());
		System.out.print("Lectures of this professor: ");
		professor.printLectures();
		
		//todo: create at least 1 student, 1 professor and one lecture
		// add the lecture to the student and the professor
	}
}
