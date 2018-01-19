
public class List {
	
	/*
	 * todo: implement the method removeYAfterX. The method should change a chained list in
	 * such a way that directly after each element with the value x, if existing, an element
	 * y gets removed.
	 * Example: x=1;y=9 (1,9,9,2,1,9,1,4,9,5) -> (1,9,2,1,1,4,9,5)
	 * Hint: You can write as many classes and methods as you want as long as removeYAfterX will
	 * be working in the end.
	 * */
	
	private Cell front = null;
	
	public void removeYAfterX(int x, int y){
		Cell marker = front;
		int count = 0;
		
		while(marker != null) {
			if(marker.content == y) {
				count++;
				if(count == x) {
					remove(marker);
					return;
				}
			}
			marker = marker.next;
		}
		System.out.println("There is no value.");
	}
	
	public void remove(Cell cell) {
		
		if(cell == front) { // cell is the head
			front = front.next;
		} else {	// cell is not the head
		Cell previous = cell.prev;		
		previous.next = cell.next;
		}
	}
	
	public void insert(int value) {
		
		// Initialize
		Cell cell = new Cell();
		cell.content = value;
		cell.next = null;	// will be the last item anyway
		
		if(front == null) {	// list is empty
			cell.prev = null;
			front = cell;
		} else {	// list not empty
			Cell marker = front;
			while(marker.next != null) {
				marker = marker.next;
			}
			marker.next = cell;
			cell.prev = marker;
		}
	}
	
	public void print() {
		
		// empty list
		if(front == null) {
			System.out.println("The list is empty.");
			return;
		}
		
		System.out.println("*** List *** ");
		Cell marker = front;
		while(marker != null) {
			System.out.println(marker.content);
			marker = marker.next;
		}
		
	}
	
}
