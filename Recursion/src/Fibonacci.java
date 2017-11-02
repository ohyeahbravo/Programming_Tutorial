import java.util.Scanner;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		
		if(n==0)
			return 0;
		
		if(n==1)
			return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
					
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Integer: ");
		int n = scan.nextInt();
		
		int result = fibonacci(n);
		
		System.out.println("Result: " + result);
	}
	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number
}
