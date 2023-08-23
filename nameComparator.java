import java.util.Comparator;

public class nameComparator implements Comparator<Student>{
	
	
	public int compare(Student s1, Student s2) {
		String nameS1 = s1.getName();
		String nameS2 = s2.getName();
		return nameS1.compareTo(nameS2);
		
		
	}
}
