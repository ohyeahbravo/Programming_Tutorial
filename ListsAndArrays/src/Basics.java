
public class Basics {
//beginner
	
	public static int getLength(int[] arr) {
		return arr.length;
	}
	
	public static int getLast(int[] arr) {
		return arr[arr.length-1];
	}
	
	public static int getSum(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < getLength(arr); i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static boolean checkElement(int[] arr, int element) {
		
		for(int i = 0; i < getLength(arr); i++) {
			if(element == arr[i])
				return true;
		}
		
		return false;
	}
	
	//test
	public static void main(String[] args) {
		
		int[] arr = { 1, 3, 5};
		
		System.out.println("Length: " + getLength(arr));
		System.out.println("Last Element: " + getLast(arr));
		System.out.println("Sum of elements: " + getSum(arr));
		System.out.println("The array contain 3? " + checkElement(arr, 3));
	}
	
	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element

}
