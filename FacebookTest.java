package Week2day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sahanasuku");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ramya.vittal91@gmail.com");
		WebElement e1 = driver.findElement(By.xpath("//span/select[@name='birthday_day']"));
		 Select dd = new Select(e1);
		 dd.selectByVisibleText("28");
		WebElement e2 = driver.findElement(By.xpath("//span/select[@name='birthday_month']"));
		Select dd1 = new Select(e2);
		dd1.selectByIndex(3);
		WebElement e3 = driver.findElement(By.xpath("//span/select[@name='birthday_year']"));
		Select dd2 = new Select(e3);
		dd2.selectByVisibleText("2000");
		driver.findElement(By.xpath("//span/input[@name='sex'][@value='1']")).click();
		

	}

}
