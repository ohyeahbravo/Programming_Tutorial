
public class Pair<V1, V2> {
	//todo: In Java it is not possible to have two return values. Luckily you can use Generics to solve that problem.
	//Change this class to a Generic where you can have a pair of two Variables even with different data types.
	//Write a constructor for this class to set those values and also getter and setter methods to retrieve them and
	//test your Methods in a driver-class
	
	V1 value1;
	V2 value2;
	
	public Pair(V1 value1, V2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public V1 getValue1() {
		return value1;
	}
	
	public V2 getValue2() {
		return value2;
	}
	
	public void setValue1(V1 value) {
		this.value1 = value;
	}
	
	public void setValue2(V2 value) {
		this.value2 = value;
	}
	
	/*
	 * public class Parameter<T,E>{
	 * 		T value;
	 * 		E newValue;
	 * 
	 * 		public Parameter(T value){
	 * 			this.value = value
	 * 		}
	 * 
	 * 		public T getValue(){
	 * 			return value
	 * 		}
	 * }
	 * 
	 * ...
	 * Parameter<Integer, Double> param = new Parameter<Integer, Double>(new Integer(5), new Double(4.7));
	 * Parameter<String> param1 = new Parameter<String>("Hello");
	 * */
}
