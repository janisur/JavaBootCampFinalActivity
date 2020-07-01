package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonUnitTest extends TestCase {
	
	// // ONLY TESTING HAPPY PATHS DUE TO THE LACK OF TIME -------------------------->>>>>>>>>>>>>>>>>>> 

	public void testPerson() {
		Person person = new Person();
        assertEquals("Unknown", person.getFirstName());
        assertEquals("Unknown", person.getSecondName());
		assertEquals(0, person.getAge());
	}

	public void testPersonStringStringInt() {
        Person person = new Person("Xavier", "Zanadoo", 100);
        assertEquals("Xavier", person.getFirstName());
        assertEquals("Zanadoo", person.getSecondName());
        assertEquals(100, person.getAge());
	}

	public void testGetFirstName() {
		Person person = new Person("Xavier", "Zanadoo", 100);
        assertEquals("Xavier", person.getFirstName());;
	}

	public void testSetFirstName() {
		Person person = new Person();
		person.setFirstName("Xavier");
        assertEquals("Xavier", person.getFirstName());
	}

	public void testGetAge() {
		Person person = new Person("Xavier", "Zanadoo", 100);
        assertEquals(100, person.getAge());;
	}

	public void testSetAge() {
		Person person = new Person();
		person.setAge(99);
        assertEquals(99, person.getAge());
	}

	public void testGetSecondName() {
		Person person = new Person("Xavier", "Zanadoo", 100);
        assertEquals("Zanadoo", person.getSecondName());;
	}

	public void testSetSecondName() {
		Person person = new Person();
		person.setSecondName("Zanadoo");
        assertEquals("Zanadoo", person.getSecondName());
	}

	public void testAnnounce() {
		Person person = new Person("Xavier", "Zanadoo", 100);
		assertEquals("My name is Xavier Zanadoo and i am 100 years old.", person.announce());
	}
	
	// <<<<<<<-----------------------   HAPPPY PATHS 

}
