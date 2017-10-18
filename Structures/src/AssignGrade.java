import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		
		double score;
		double grade = 0;
		
		System.out.print("Enter your score: ");
		
		Scanner scan = new Scanner(System.in);
		
		score = scan.nextDouble();
		
		if(score < 0 || score > 100) {
			System.out.println("Score out of range.");
			return;
		}
		
		else if(score > 95)
			grade = 1.0;
		else if(score > 90)
			grade = 1.3;
		else if(score > 85)
			grade = 1.7;
		else if(score > 80)
			grade = 2.0;
		else if(score > 75)
			grade = 2.3;
		else if(score > 70)
			grade = 2.7;
		else if(score > 65)
			grade = 3.0;
		else if(score > 60)
			grade = 3.3;
		else if(score > 55)
			grade = 3.7;
		else if(score >= 50)
			grade = 4.0;
		else
			grade = 5.0;
		
		// Print the grade
		System.out.println("Your grade is " + grade);
		
		if(grade == 5.0)
			System.out.println("You have failed. Sooorrryyy!");
		else
			System.out.println("You have passed. Well Done!");
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}