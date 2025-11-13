package lao.abstraction;
//One Interface can extend another Interface using extends keyword. But Class should implements Interface.

public interface UpComingProjects extends Interface2{
	
	String upComingProject="New Project"; //Variables of Interface → Public & Static & Final Variable

	public void employee();
	public void method1();
	public void method2();

}


//Interfaces cannot have body for methods
//Interface methods are → Default Abstract methods  ( & Public modifiers)
