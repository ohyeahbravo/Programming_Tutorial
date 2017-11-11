import java.util.Scanner;

//advanced

public class Expand2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// get input
		System.out.print("Enter sets of a number and a character (ex. 2a3b5c) : ");
		String input = scan.nextLine();
		
		// variables
		char current;
		int num = 0;
		String result = "";
		
		for(int i = 0; i < input.length(); i++) {
			 // get the next character
			current = input.charAt(i);
			
			// NUMBER: update the number variable as such
			if(current >= '0' && current <= '9')
				num = num * 10 + Integer.parseInt(String.valueOf(current));
			
			// STRING
			else {
				// one STRING: add to result right away
				if(num == 0)
					result += current;
				
				// multiple STRING: add as many
				else {
					for(int j = 0; j < num; j++)
						result += current;
					num = 0;	// initialize the num value to 0
				}
			}	
		}
	
		// Print the result
		System.out.println("Result: " + result);
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
	}
	
}
