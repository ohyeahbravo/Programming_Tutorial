import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input;
		boolean quit = false;
		int sum = 0;
		
		do {
			
			System.out.print("Enter an integer ('s' to quit) : ");
			input = scan.nextLine();
			
			// set quit boolean true if the input is 's'
			if(input.equals("s")) 
				quit = true;
			
			// else add the input to sum
			else
				sum += Integer.parseInt(input);
				
		} while(quit == false);
		
		System.out.println("sum: " + sum);
		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		
	}
	
}
