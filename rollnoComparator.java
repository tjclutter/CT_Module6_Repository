import java.util.Comparator;

//create rollnoComparator class that inherits from Comparator
public class rollnoComparator implements Comparator<Student>{
	
	//customize compare method to compare roll numbers of students
	public int compare(Student s1, Student s2) {
		//get roll numbers and store in variables
		int rollnoS1 = s1.getRollno();
		int rollnoS2 = s2.getRollno();
		
		//if rollnoS1 is greater than rollnoS2 return 1
		//if rollnoS2 is greater than rollnoS1 return -1
		//if rollno's are equal return 0
		if (rollnoS1 > rollnoS2){
			return 1;
		}else if (rollnoS2 > rollnoS1) {
			return -1;
		}else {
			return 0;
		}
	}
}