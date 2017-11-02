import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		if(n==2)
			return 2;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Integer: ");
		int n = scan.nextInt();
		
		int result = factorial(n);
		
		System.out.println("Result: " + result);
	}
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
}
