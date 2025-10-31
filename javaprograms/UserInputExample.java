package javaprograms;

import java.util.Scanner; //import Scanner class

public class UserInputExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); // Create Scanner Object
		
	    System.out.println("Enter a number"); // ask for input
	    int num=sc.nextInt(); //read integer input
	    System.out.println("You Entered "+ num); // print it
	    
	    sc.close();//Close the Scanner

	}

}
