import java.util.*;
import java.io.*;
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create array list to hold student objects
		ArrayList<Student> students = new ArrayList<Student>();
		
		//create 10 Student objects with random roll numbers
		students.add(new Student(145, "John", "1"));
		students.add(new Student(162, "Hector", "2"));
		students.add(new Student(119, "Jane", "3"));
		students.add(new Student(64, "Rob", "4"));
		students.add(new Student(295, "Kaitlin", "5"));
		students.add(new Student(300, "Alex", "6"));
		students.add(new Student(16, "Steve", "7"));
		students.add(new Student(19, "Oliver", "8"));
		students.add(new Student(2, "Meghan", "9"));
		students.add(new Student(283, "George", "10"));
		
		//sort student list using class rollnoComparator that implements compare
		Collections.sort(students,new rollnoComparator());
		
		//create iterator object to go through student array list
		Iterator<Student> rollNumberItr = students.iterator();
		
		//while rollNumberItr has next Student object assign student object to st variable
		//and then print out the students roll number, name, and address
		System.out.println("Sort by roll Number");
		while(rollNumberItr.hasNext()) {
			Student st = (Student)rollNumberItr.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAddress());
		}
		
		Collections.sort(students, new nameComparator());
	
		Iterator<Student> nameItr = students.iterator();
		System.out.println();
		System.out.println("Sort by Name");
		
		//while nameItr has next Student object assign student object to st variable
		//and then print out the students roll number, name, and address 
		while(nameItr.hasNext()) {
			Student st = (Student)nameItr.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAddress());
		}
		
		ArrayList<Student> sortList = new ArrayList<Student>();
		sortList = selectionSort(students);
		
		Iterator<Student> selectionSortItr = sortList.iterator();
		System.out.println();
		System.out.println("Sort using selection sort");
		
		while(selectionSortItr.hasNext()) {
			Student st = (Student)selectionSortItr.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAddress());
		}
		
	}
public static ArrayList<Student> selectionSort(ArrayList<Student> list){
		int currentMin;
		Student currentMinStudent;
		Student compare;
		for (int i = 0; i < list.size() - 1; i++) {
			currentMin = i;
			for (int j = i + 1; j < list.size(); j++) {
				currentMinStudent = list.get(currentMin);
				compare = list.get(j);
				if(currentMinStudent.getRollno() > compare.getRollno()) {
					
					currentMin = j;
				}
				
				
				
				
			}
			if(currentMin != i) {
				System.out.println(list);
				Collections.swap(list, i, currentMin);
			}
			
			
			
			
		}
	return(list);	
	}
}
	