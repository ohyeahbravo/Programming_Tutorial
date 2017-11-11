import java.util.Scanner;
import java.text.DecimalFormat;

public class AccountBook {
//intermediate (multidimensional arrays)
	
	public static int thisYear = 2017;
	
	public static double[][] makeAccountbook(double money){
		
		double[][] accountBook = new double[2][10];
		int year = thisYear;
		
		for(int i = 0; i < 10; i++) {
			accountBook[0][i] = year;
			year++;
			
			accountBook[1][i] = money;
			money *= 1.02;
		}
		
		return accountBook;
	}
	
	public static double getSaving(int year, double initial) {
		
		double[][] accountBook = makeAccountbook(initial);
		
		double saving = 0;
		
		for(int i = 0; i < accountBook[0].length; i++) {
			if(accountBook[0][i] == year)
				saving = accountBook[1][i];
		}
		return saving;
	}
	
	public static void main(String[] args) {
		
		// Formatter for numbers
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		Scanner scan = new Scanner(System.in);
		int year = 0;
		double initial = 0;
		
		do {
			
			System.out.print("Enter a year between 2017 and 2027: ");
			year = scan.nextInt();
			
		} while(year < 2017 || year > 2027);
		
		do {
			
			System.out.print("Enter the amount of money above 0: ");
			initial = scan.nextDouble();
			
		} while(initial < 0);

		double saving = getSaving(year, initial);
		
		System.out.println("The saving you would have at " + year + " is " + formatter.format(saving));
		
	}

	//todo: a bank will give you 2% interest on your savings stored on an account book.
	//for a certain amount of money you want to store in the account book create a multidimensional array where
	//the interest of the next 10 years is stored.
	//For that save the year and the amount of money. Write a method which takes a certain year as input (e.g. 2019) and an amount of money you would like to store
	//and returns the saving you would have for this year.

}
