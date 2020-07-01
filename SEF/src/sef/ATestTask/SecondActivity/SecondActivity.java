package sef.ATestTask.SecondActivity;
// Complete Code

import java.util.*;

public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more
		
		System.out.println("Sum is: " + calculator.sum(1, 5));
		
		System.out.println("Division is: " + calculator.divide(100, 33));
		
		System.out.println("Subraction is: " + calculator.subtract(3, 2));

		
		double[] numbers = {5, 6, 10};
		System.out.println("Multiplication is: " + multiply(numbers));		

		
		//      BONUS 
		System.out.println("\n");
		System.out.println("BONUS IMPLEMENTATION OF THE SCANNER UTIL");
		System.out.println("Please provide a double:");
		Scanner scan = new Scanner(System.in);
		double x = Double.valueOf(scan.nextLine());
		System.out.println("Please provide another double:");
		double y = Double.valueOf(scan.nextLine());
		System.out.println("Sum of your input is:");
		System.out.println(calculator.sum(x, y));

	}

	//TODO create the Calculator (here or in additional class)
	
	static double sum(double x, double y) {
		double sum = x + y;
		return sum;
	}

	static double subtract(double x, double y) {
		double diff = 0;
		if (x > y) {
		diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

	static double multiply(double[] numbers) {
		double temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	static double divide(double x, double y) {
		double divValue = 0;
		if (x == 0 || y == 0) {
			divValue = 0;
			System.out.println("Please choose input that's not ZERO" + "\n");
		} else {
			divValue = x / y;
		}
		return divValue;

	}

}
