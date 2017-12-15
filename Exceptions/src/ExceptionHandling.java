
public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception

		int a = 5;
		int b = 0;
		
		try {
			int div = a/b;
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		try {
			int[] arr = new int[5];
			arr[5] = 7;
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			String one = "one";
			int i = Integer.parseInt(one);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		try {
			double c = -7.0;
			if(c < 0.0) {
				throw new NegativeRootException("Square Root cannot be applied to a negative number.");
			}
			double d = Math.sqrt(c);
			System.out.println(d);
			//
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	
class NegativeRootException extends Exception {
	String err_msg;
	
	NegativeRootException(String exp) {
		super(exp);
	}
	
	public String toSring() {
		return err_msg;
	}
}
