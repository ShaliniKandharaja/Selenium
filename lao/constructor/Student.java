package lao.constructor;

public class Student {
	
	String student_name;
	int rollNumber;
	// When we don't create constructor in Class, Complier will create default constructor.
	// If variables don't have assigned values, Constructor will give default values to the variable
	
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.student_name);
		System.out.println(s1.rollNumber);
		
	}

}
