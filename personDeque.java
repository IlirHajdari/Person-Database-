import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class personDeque {
	//Create Deque to populate with Person objects
	static Deque<Person> myDeque = new LinkedList<>();
	static Person[] aList;
	
	//Method to add Person details by collecting from scanner
	public String addPerson(Scanner scnr) {
		Person currentPerson;
		String firstName = scnr.next();
		String lastName = scnr.next();
		int age = scnr.nextInt();
		
		//Adds Person to Deque using constructor
		currentPerson = new Person(firstName, lastName, age);
		myDeque.add(currentPerson);
	
	return firstName +" "+ lastName +" "+ "Added";
	}
	
	//Method to sort by Age
	public static void quickSortAge(Deque<Person> list) {
		//Converts to Array
		aList = list.toArray(new Person[list.size()]);
		int first = 0;
		int last = myDeque.size() - 1;
		
		
		// test to see if Array contains any data
		System.out.println("\nTEST: deque has " + myDeque.size() + " Entries.\nMy array has People too");
		for (Person arrayList : aList) {
			System.out.print(arrayList.getAge() +" ");
		}
		System.out.println();

		//Pass Array to quickSortAge
		quickSortAge(aList, first, last);	
	}
	
	//Recursive call quickSortAge
	private static void quickSortAge(Person[] list, int first, int last) {
		
		if (first < last) {
			
		
		int pivotIndex = partitionAge(list, first, last);
		
		
		quickSortAge(list,first, pivotIndex - 1);
		
		
		quickSortAge(list, pivotIndex + 1, last);
		}
		//clears list
		myDeque.clear();
		for (Person sortedPpl : aList) {
			myDeque.add(sortedPpl);
		}
		
	}
	
	//quick sort partition
	private static int partitionAge(Person[] list, int first, int last) {
		
		int mid = (first + last)/2;
	
		Person pivotValue = list[mid];
		list[mid] = list[last];
		list[last] = pivotValue;
		int pivotIndex = last;
		
		
		int indexFromLeft = first;
		int indexFromRight = last - 1;
		boolean done = false;
		
		while (!done) {
			
			while (list[indexFromLeft].getAge() < pivotValue.getAge()) {
				indexFromLeft++;
			}
			
			while ((list[indexFromRight].getAge() > pivotValue.getAge()) && indexFromRight > 0) {
				indexFromRight--;
			}
			
			if (indexFromLeft < indexFromRight) {
				Person tempPerson = list[indexFromRight];
				list[indexFromRight] = list[indexFromLeft];
				list[indexFromLeft] = tempPerson;
				indexFromLeft++;
				indexFromRight--;
			}
			
			else {
				done = true;
			}
		}
		
		Person tempPerson = list[pivotIndex];
		list[pivotIndex] = list[indexFromLeft];
		list[indexFromLeft] = tempPerson;
		pivotIndex = indexFromLeft;
		
		return pivotIndex;
	}
	
	
		public static void quickSortName(Deque<Person> list) {
			
			aList = list.toArray(new Person[list.size()]);
			int first = 0;
			int last = myDeque.size() - 1;
			
		
			quickSortName(aList, first, last);	
		}
		
		// small and large sort
		private static void quickSortName(Person[] list, int first, int last) {
			
			if (first < last) {
				
			
			int pivotIndex = partitionName(list, first, last);
			
		
			quickSortName(list,first, pivotIndex - 1);
			
			
			quickSortName(list, pivotIndex + 1, last);
			}
			
			myDeque.clear();
			for (Person sortedPpl : aList) {
				myDeque.add(sortedPpl);
			}		
		}	
		
		// another quick sort partition
		private static int partitionName(Person[] list, int first, int last) {
			
			int mid = (first + last)/2;
			
			Person pivotValue = list[mid];
			list[mid] = list[last];
			list[last] = pivotValue;
			int pivotIndex = last;
			
			
			int indexFromLeft = first;
			int indexFromRight = last - 1;
			boolean done = false;
			
			while (!done) {
				
				while (list[indexFromLeft].getLastName().compareTo(pivotValue.getLastName()) < 0) {
					indexFromLeft++;
				}
				
				while ((list[indexFromRight].getLastName().compareTo(pivotValue.getLastName()) > 0) && indexFromRight > 0) {
					indexFromRight--;
				}
			
				if (indexFromLeft < indexFromRight) {
					Person tempPerson = list[indexFromRight];
					list[indexFromRight] = list[indexFromLeft];
					list[indexFromLeft] = tempPerson;
					indexFromLeft++;
					indexFromRight--;
				}
				
				else {
					done = true;
				}
			}
			
			Person tempPerson = list[pivotIndex];
			list[pivotIndex] = list[indexFromLeft];
			list[indexFromLeft] = tempPerson;
			pivotIndex = indexFromLeft;
			
			return pivotIndex;
		}

}
