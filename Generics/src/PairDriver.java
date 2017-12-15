import java.util.ArrayList;


public class PairDriver {
	
	public static void main(String[] args) {
		
		Pair<Double, Integer> pair1 = new Pair<Double, Integer>(new Double(1.5), new Integer(5));
		Pair<String, Boolean> pair2 = new Pair<String, Boolean>(new String("All men Die"), new Boolean(true));
		Pair<String, Boolean> pair3 = new Pair<String, Boolean>(new String("Sun rises in the west"), new Boolean(false));
		
		System.out.println(pair1.getValue1() + " " + pair1.getValue2());
		System.out.println(pair2.getValue1() + " " + pair2.getValue2());
		System.out.println(pair3.getValue1() + " " + pair3.getValue2());
		
	}
	
}