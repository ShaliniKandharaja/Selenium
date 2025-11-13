package lao.constructor;

public class ChildClass extends ParentClass{
	//Super() → Relationship between Parent & Child Class.
	//Note : If Child is created that class will have the Super() keyword. That will be invisible.

	ChildClass(){
		super();
		System.out.println("Child Class constructor");
	}

	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
	}
}
