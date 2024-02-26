package testngadvanceconcepts;

import org.testng.annotations.Test;

public class LearnAttributes {
  @Test(priority=2)
  public void createLead() {
	  System.out.println("Lead Created Successfully");
  }
  
  @Test(priority=3)
  public void deleteLead() {
	  System.out.println("Lead Deleted Successfully");
  }
  
  @Test(priority=4)
  public void mergeLead() {
	  System.out.println("Lead Merged Successfully");
  }
  
  @Test(dependsOnMethods = {"createLead","deleteLead"},priority=1)
  public void editLead() {
	  System.out.println("Lead Edited Successfully");
  }
  
  
  
}
