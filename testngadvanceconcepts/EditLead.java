package testngadvanceconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead {


	@DataProvider//(name="fetchData")
	public String[][] sendData() {
		//RowCount ColumnCount
		String data[][]=new String[2][3];

		//1st Set of Data
		data[0][0]="Testleaf";
		data[0][1]="Raja";
		data[0][2]="D";

		//2nd Set of Data
		data[1][0]="Qeagle";
		data[1][1]="Ramesh";
		data[1][2]="D";
		
		//3rd Set of Data
		//data[0][1]="93";
		//data[0][2]="Infosys";


		return data;
	}

	//@Test(dependOnMethos="PackageName.ClassName.MethodName")
	//@Test(dependOnMethos="week6.day1.CreateAccount.createLead")
	@Test(dataProvider="sendData")   //(invocationCount = 4,threadPoolSize = 2,timeOut = 20000)
	public void editLead(String cName,String fName,String lName) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//enter UserName
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("Demosalesmanager");

		//enter Password
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("crmsfa");

		//Click Login Button
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

		//timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Click crmsfa link
		WebElement crmsfaLink=driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		crmsfaLink.click();

		//click leads link
		WebElement leads=driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();

		//click create lead link
		WebElement createLead=driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]"));
		createLead.click();

		//timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//enter company name
		WebElement companyName=driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]"));
		companyName.sendKeys(cName);

		//enter first name
		WebElement firstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys(fName);

		//enter last name
		WebElement lastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys(lName);

		//enter firstNameLocal field
		WebElement firstNameLocal=driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
		firstNameLocal.sendKeys("Naganallur");

		//enter Department field
		WebElement departmentName=driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("Information Technology");

		//enter description
		WebElement descriptionField=driver.findElement(By.xpath("//textarea[@name='description']"));
		descriptionField.sendKeys("Automation TEster");

		//enter Email
		WebElement email=driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]"));
		email.sendKeys("shalinikandharaja@gmail.com");



		//Select New York in State/Province Drop down
		WebElement state=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select select5=new Select(state);
		select5.selectByVisibleText("New York");

		//Click on Create Lead
		WebElement createLead1=driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLead1.click();


		//Click on Edit
		WebElement edit=driver.findElement(By.xpath("//a[text()='Edit']"));
		edit.click();

		//Clear Description
		WebElement descriptionField2=driver.findElement(By.xpath("//textarea[@name='description']"));
		descriptionField2.clear();

		//Important Note Field
		WebElement importantNote=driver.findElement(By.name("importantNote"));
		importantNote.sendKeys("Selenium with Java");

		//Click on Update
		WebElement update=driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
		update.click();

		//timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String title=driver.getTitle();
		System.out.println("Title of the page is : "+title);

		//driver.close();



	}

}
