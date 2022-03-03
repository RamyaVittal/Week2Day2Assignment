package Week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Ramya");
			driver.findElement(By.id("lastNameField")).sendKeys("Vittal");
			 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ramyasuku");
			 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Suku");
			 driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("CSE");
			 driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Student of selenium feb 22 batch");
			 driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("ramya.vittal@gmail.com");
			 WebElement el11= driver.findElement(By.name("generalStateProvinceGeoId"));
			 Select dd = new Select(el11);
			 dd.selectByVisibleText("New York");
			 driver.findElement(By.className("smallSubmit")).click();
			 driver.findElement(By.linkText("Edit")).click();
			 driver.findElement(By.id("updateContactForm_description")).clear();
			 driver.findElement(By.name("importantNote")).sendKeys("some values asked to be given");
			 driver.findElement(By.name("submitButton")).click();
			 
			 System.out.println(driver.getTitle());

		/*  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
         */
		

	}

}
