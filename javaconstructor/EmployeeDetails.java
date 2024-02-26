package javaconstructor;

public class EmployeeDetails {
	int empId;
	String empName;
	boolean empStatus;
	//Constructor is a special type of method which used to initialize object
	//Constructor name as same as class name
	public EmployeeDetails() { // Explicit constructor
		this(400, "Subraja", true);// Calling Parameterized constructor from default constructor( constructor Chaining)
		System.out.println("Default constructor");
		empId=100;
	}
	
	public EmployeeDetails(int empId,String empName,boolean empStatus) { // Parameterized constructor
		//Constructor over loading
		//Inside this constructor we have local variable
	//	this();//Calling  default constructor from Parameterized constructor
		System.out.println("Parameterized constructor");
		this.empId=empId;     //  Can we use same values for global & local variables, if we use how can we identify?
		this.empName=empName;  // Example, empId=empId;( no we cannot use)
		this.empStatus=empStatus; // this.empId represent current class global variable
		
	}
	
	//Constructor will assign initial values to the global variables
	public static void main(String[] args) {
		EmployeeDetails ed=new EmployeeDetails(); // implicit constructor
		System.out.println(ed.empId+"\n"+ed.empName+"\n"+ed.empStatus);
		
		/*
		EmployeeDetails ed1=new EmployeeDetails(400, "Subraja", true); // Parameterized constructor
		//Local variable values will be assigned to global variables
		System.out.println(ed1.empId+"\n"+ed1.empName+"\n"+ed1.empStatus);
		
		*/
 
	}
 
}
// If you want want to do something, one object is created, that initialization wiil be done by constructor
//Real time Example:
	// ChromeDribver driver=new ChromeDriver(); ( Once driver object created, Chrome Web will be opened)
//Can we call one constructor from another constructor?
//Yes, it can be achieved using constructor chaining ( using this keywaord)


