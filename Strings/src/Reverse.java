import java.util.Scanner;

//intermediate

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// get input
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		
		// initialize the result
		String result = "";
		
		// reverse the the string
		for(int i = input.length()-1; i >= 0; i--) {
			result += input.charAt(i);
		}
		
		System.out.print("Reversed: " + result);
		//todo: take an String as input and reverse it. Then print it.
		
	}

}
