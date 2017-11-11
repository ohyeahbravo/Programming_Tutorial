import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// get input
		System.out.print("Enter sets of a number and a character (ex. 2a3b5c) : ");
		String input = scan.nextLine();
		
		// variables
		int i = 0;	// iterater for each character
		boolean isString;	// is the current character a string?
		boolean wasString = false;	// is the previous character a string?
		String temp = "";
		String result = "";
		
		do {
			//***** is it a STRING or a NUMBER ? *****
			char character = input.charAt(i); // get the next character in the string
			if(character >= '0' && character <= '9')
				isString = false;	// number
			else
				isString = true;	// string
			
			//***** processing *****
			if(i == 0 || isString == wasString) {
				
				if(isString)
					result += character;
				
				else
					temp += character;
			}
			
			else {
				
				if(!wasString) {
					int number = Integer.parseInt(String.valueOf(temp));
					for(int j = 0; j < number; j++) {
						result += character;
					}
					temp = "";
				}
				
				// previous was a string, and current is a number
				else {
					temp += character;
				}
			}
			
			//***** set values before next step *****
			wasString = isString;
			i++;	// iterate over the characters
		
		} while(i < input.length());
		
		
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
