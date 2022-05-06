import java.util.*;

public class Person {
	
	String firstName;
	String lastName;
	String allData;
	int age;
	
	public Person() {
		firstName = "Anakin";
		lastName = "Skywalker";
		age = 0;
	}
	
	//Constructor with attributes and variables to display all
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		allData = firstName +" "+ lastName +" "+ age;
	}
	
	//return via firstName
	public String getFirstName() {
		return firstName;
	}
	
	// set the firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//return via lastName
	public String getLastName() {
		return lastName;
	}
	
	//set lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//return via age
	public int getAge() {
		return age;
	}
	
	//set age
	public void setAge(int age) {
		this.age = age;
	}

}
