import java.util.*;

//create Student class with fields for roll number
//name and address
public class Student {
	private int rollno;
	private String name;
	private String address;
	
	//Create class constructor
	Student(int rollno, String name, String address){
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	//create methods for getting the roll number
	//name and address of a student
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
}