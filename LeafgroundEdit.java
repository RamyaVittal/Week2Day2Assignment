package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/Edit.html");
		WebElement q= driver.findElement(By.xpath("//label/following::input[@value ='Append ']"));
		q.sendKeys(Keys.BACK_SPACE);
		q.sendKeys("xxx");
		q.sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Get default text entered')]/following::input[@name='username'][1]")).getAttribute("value"));
		driver.findElement(By.xpath("//label[contains(text(),'Clear the text')]/following::input[@name='username']")).clear();
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Clear the text')]/following::input[2]")).isEnabled());


	}

}
