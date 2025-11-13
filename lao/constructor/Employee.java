package lao.constructor;

public class Employee {
	
	int employeeID;
	String employeeName;
	
	Employee(){
		employeeID=1;
		employeeName="Shalini";
		System.out.println("Object Initiated");
	}
	
	public static void main(String [] args) {
		Employee emp=new Employee();
		System.out.println(emp.employeeID);
		System.out.println(emp.employeeName);
	}

}
