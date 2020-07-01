package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
	
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old." + "\n" + "I'm studying in a univerity " + getSchoolName() + " .";
	}
	
	
	public static void main(String[] args) {
	Student studentOne = new Student();
	
	studentOne.setFirstName("Ivo");
	studentOne.setSecondName("Berzins");
	studentOne.setAge(31);
	studentOne.setSchoolName("BA");
	
	
	System.out.println(studentOne.announce());
	}
	
}
