public class Driver {
	
	public static void main(String[] args) {
		
		// my dear pet piggy
		Date pigday = new Date(2005, 11, 30);
		Pig piggy = new Pig("Piggy", pigday, true);
		
		// cute but dangerous predator leo
		Date lionday = new Date(1800, 4, 2);
		Lion leo = new Lion("Leo", lionday, false);
		
		// let me introduce my pet
		System.out.println("Let me introduce my pet " + piggy.name + ".");
		System.out.println("It is a " + piggy.getGender() + " and born on " + piggy.birthday.toString() + ".");
		
		// pet my pet
		piggy.saySomething();
		piggy.pet();
		
		// here comes the predator
		System.out.println("\nHere comes the predator " + leo.name + ".");
		System.out.println("It is a " + leo.getGender() + " and born on " + leo.birthday.toString() + ".");
		
		// Warning!
		leo.saySomething();
		leo.warningPlate();
	}
}