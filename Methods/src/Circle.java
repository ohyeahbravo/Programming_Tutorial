import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
	
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	
	public static double diameter(double r) {
		return 2*r;
	}
	
	public static double circumference(double r) {
		return Math.PI * 2 * r;
	}
	
	public static double area(double r) {
		return Math.PI * r * r;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Formatter for numbers
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		// Get radius
		System.out.println("Enter the radius: ");
		double r = scan.nextDouble();
		
		// Use methods to calculate
		double d = diameter(r);
		double c = circumference(r);
		double a = area(r);
		
		// Print results
		System.out.println("Diameter: " + formatter.format(d));
		System.out.println("Circumference: " + formatter.format(c));
		System.out.println("Area: " + formatter.format(a));
	}
}
