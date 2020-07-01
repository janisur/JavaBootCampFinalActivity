package sef.ATestTask.FirstActivity;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstActivity extends Person {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result
		
		List<Employee> employees = new ArrayList<Employee>();
		
	    employees.add(new Employee("Kate", 18, 100));
	    employees.add(new Employee("Baiba", 19, 200));
	    employees.add(new Employee("Ilze", 20, 300));
	    employees.add(new Employee("Keita", 21, 400));
	    employees.add(new Employee("Leila", 23, 500));
	    employees.add(new Employee("Ilona", 24, 600));
	    


	    FirstActivity obj = new FirstActivity();
	    obj.print(employees);
	    
	    

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of a Student as a Person ->
	    

		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		Iterator i = list.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
	}	

	
}
