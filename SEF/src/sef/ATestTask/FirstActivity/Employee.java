package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee() {
    	this.empId = 0;
    	this.jobTitle = "Unknown";
    	this.companyName = "Unknown";
    	this.salary = 0.0;
    }
       
    public Employee(String firstName, String secondName, int age, String jobTitle, String companyName) {
    	   	
    	this.firstName = firstName;
    	this.secondName = secondName;
    	this.age = age;
    	this.jobTitle = jobTitle;
    	this.companyName = companyName;
    	
    }
    
    public Employee(int empId, String jobTitle, String companyName, double salary ) {
    	this.empId = empId;
    	this.jobTitle = jobTitle;
    	this.companyName = companyName;
    	this.salary = salary;
    	
    }
    
    public Employee(String firstName, int age, double salary ) {

    	this.salary = salary;
    	
    	this.firstName = firstName;
    	this.age = age;
    }
    
    //TODO 2 add getters and setters

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
  

    //TODO 3 override method announce()
	
	public String announce() {
		return "My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years old." + "\n" + "I work as " + getJobTitle() + " in " + getCompanyName() + ".";
		
	}
    
	// PLAYING IN THE SANDBOX
	

//	 public static void main(String[] args) {
////	 
////	 Employee realDeal = new Employee("Draco", 18, 10000.67);
////	  
////	 System.out.println(realDeal.announce());
////	 
////	 realDeal.setFirstName("Sirius");
////	 realDeal.setAge(47);
////	 realDeal.setSalary(1000.51);
////	 
////	 System.out.println("\n" + "Take into account that i'm older, anyhow... " + realDeal.announce());
////	 
//	Employee brandNew = new Employee("Draco", "Malfoy", 18, "Apprentice", "School");
//	System.out.println(brandNew.announce());
//		 
//		 
//	 }
 




}