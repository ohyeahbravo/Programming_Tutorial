
public class BubbleSort {
//intermediate
	
	public static void printArr(int[] arr) {
		System.out.print("{ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		boolean sorted = false;
		
		do {
			sorted = false;
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = true;
				}
			}
		} while(sorted == true);
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = { 6, 4, 8, 2, 9};
		
		System.out.print("Initial array: ");
		printArr(arr1);
		
		int[] arr2 = bubbleSort(arr1);
		
		System.out.print("\nSorted array: ");
		printArr(arr2);
	}
	
	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	
}
