import java.util.Scanner;


public class Prime {
	
	// A method to tell whether it's a prime or not
	public static boolean isPrime(int n) {
		for(int i = 2; i < n; i++)
			// if the number is dividable, it is not a prime
			if (n % i == 0) 
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: write a method which tells you if a given number is a prime or not
		
		// Get an integer as an input
		System.out.println("Give an integer: ");
		int num = scan.nextInt();
		
		// Print the result
		if(isPrime(num) == true)
			System.out.println("It is a prime.");
		else
			System.out.println("It is NOT a prime.");
	}
	
}
