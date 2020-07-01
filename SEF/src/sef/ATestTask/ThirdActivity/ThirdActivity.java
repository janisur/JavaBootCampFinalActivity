package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import sef.ATestTask.SecondActivity.CustomException;

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
//        try {
        	
        ta.validateUser("Mike");
       
//        } catch (CustomException e) {
//        	System.out.println(e.toString());	
//        }
        
        ta.catchExeption();
        
        ta.catchMe(10,0);
    }

    void catchExeption() {
        try {
    	int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= 10; i++) {
            System.out.println(arr[i]);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("Something went wrong - check the array index");
    	} finally {
        }
        System.out.println("This should get printed even if there is an exception" + "\n");

    }

    void validateUser(String name) { //throws CustomException {
        
    	String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exeption

        for(int i = 0; i < validUsers.length; i++) {
        	if (validUsers[i] == name) {
        		flag = true; 
        		System.out.println("SUCCESS!" + "\n");
        	} else if (flag){
        		//throw new CustomException();
        	}
        	
        	       	
        	
        }
        
        
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
            try {
    		int result=num1/num2;
            System.out.println("The result is :" + result);
            } catch (ArithmeticException e) {
            System.out.println("Division by zero can not be performed - choose another divisor.");
            } finally {            
            
            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
            }

    }
}

