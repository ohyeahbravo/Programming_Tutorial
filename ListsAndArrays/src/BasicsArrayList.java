import java.util.ArrayList;

public class BasicsArrayList {
//beginner
	
	public static ArrayList addValue(ArrayList list, String value) {
		list.add(value);
		
		return list;
	}
	
	public static void printList(ArrayList list) {
		
		System.out.print("elements: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("");
		
		// or like below;
		//System.out.println(list);
	}
	
	public static void main(String args[]) {
		
		// create an array list
		ArrayList list = new ArrayList();
		
		// add some initial values to the array list
		list.add("old1");
		list.add("old2");
		
		// print the array list
		printList(list);
		
		// add a new value to the array list
		String newValue = "new";
		addValue(list, newValue);
		
		// print the array list with the new value
		printList(list);
	}
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList

}
