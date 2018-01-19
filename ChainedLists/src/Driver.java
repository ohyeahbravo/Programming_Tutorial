
public class Driver {
	
	public static void main(String[] args) {
		List list = new List();
		
		list.print();
		list.removeYAfterX(1, 1);
		list.print();
		list.insert(1);
		list.print();
		list.removeYAfterX(1, 1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(3);
		list.insert(2);
		list.insert(6);
		list.insert(2);
		list.print();
		list.removeYAfterX(2, 3);
		list.print();
		list.removeYAfterX(3, 2);
		list.print();
		list.removeYAfterX(1, 6);
		list.print();
	}
	
}