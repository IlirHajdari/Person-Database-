import java.util.Iterator;
import java.util.Scanner;

public class dequeDriver extends personDeque {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		personDeque personList = new personDeque();
		
		//prompting user for 5 people
		System.out.println("Enter persons first name, last name, and age: ");
		System.out.println(personList.addPerson(scnr));
		System.out.println();
		System.out.println("Enter persons first name, last name, and age: ");
		System.out.println(personList.addPerson(scnr));
		System.out.println();
		System.out.println("Enter persons first name, last name, and age: ");
		System.out.println(personList.addPerson(scnr));
		System.out.println();
		System.out.println("Enter person first name, last name, and age: ");
		System.out.println(personList.addPerson(scnr));
		System.out.println();
		System.out.println("Enter persons first name, last name, and age: ");
		System.out.println(personList.addPerson(scnr));
		System.out.println();
		System.out.println("Enter persons first name, last name, and age: ");

		//show deque is populated by iteration
		Iterator<Person> iterator = myDeque.iterator();
		
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.allData);
		}
		
		//prompt user to select parameter to sort by
		Boolean sorted = false;
		while (!sorted) {
			System.out.println("\nTo sort by Age enter 'a'. To sort by last name enter 'n'." + "\nTo quit, enter 'q'. Press enter to confirm.");
			
			//collect user input
			char sortBy = scnr.next().charAt(0);
			
			//convert user input to lower case for switch comparison
			switch (Character.toLowerCase(sortBy)) {
			case 'a':
					//sort by age and print deque after sorting
					quickSortAge(myDeque);
					System.out.println("\nDeque sorted by age: ");
					
					Iterator<Person> iteratorSorted = myDeque.iterator();
					
					while(iteratorSorted.hasNext()) {
						Person person = iteratorSorted.next();
						System.out.println(person.allData);
					}
					
				break;
				
			case 'n':
					quickSortName(myDeque);
					System.out.println("\nDeque sorted by last name: ");
					
					Iterator<Person> iteratorSorted2 = myDeque.iterator();
					
						while(iteratorSorted2.hasNext()) {
							Person person = iteratorSorted2.next();
							System.out.println(person.allData);
						}
				break;
				
				//Quit command ends program, while loop making sorted data true
			case'q':
					System.out.println("Sorting complete. End!");
					sorted = true;
					break;
					
				default:
						System.out.println("Try again");
						//Keeping sorted false continues loop until valid input is received
						break;
				
			}
		}
	}
}
