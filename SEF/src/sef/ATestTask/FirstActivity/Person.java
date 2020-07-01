package sef.ATestTask.FirstActivity;

public class Person {

//TODO 1 Implement Person Attributes

	String firstName;
	String secondName;
	String fullName = firstName + " " + secondName;
	int age;

	// Behavior - default constructor
	public Person() {
		this.firstName = "Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	// Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
		if(firstName.matches(".*\\d.*")){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			
			throw new IllegalArgumentException("Input can't be a number!!");
		}
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
		
		if(secondName.matches(".*\\d.*")){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			
			throw new IllegalArgumentException("This input also can't be a number!!");
		}
	}

	// TODO 2 add all person info into announce() method
	public String announce() {

		return "My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old.";

	}
	
	 
	// PLAYING IN THE SANDBOX

	
//	 public static void main(String[] args) {
//	  
//	 Person himOrHer = new Person("Xavier", "Zanadoo", 100);
//	 
//	 System.out.println(himOrHer.announce());
//	  
//	 himOrHer.setAge(101);
//	  
//	 System.out.println("\n" + himOrHer.announce() + " And i'm not getting younger (:");
	
//	Person himOrHerTwo = new Person();
//	
//	himOrHerTwo.setFirstName("Ivan3");
//	  
//	 }
	
}
