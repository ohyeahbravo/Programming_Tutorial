
class Pig extends Animal implements Pet {
	
	public Pig(String name, Date birthday, boolean isFemale) {
		this.name = name;
		this.birthday = birthday;
		this.isFemale = isFemale;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public String getGender() {
		if(isFemale = true)
			return "female";
		else return "male";
	}
	
	public void saySomething() {
		System.out.println("\"OINK OINK\"");
	}
	
	public void pet() {
		System.out.println("Awwwwwww");
	}
	
}