package Week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Giving input tag in xpath finds the webelemnet, included div tag just for checking functionality purpose.
		driver.findElement(By.xpath("//div[@class='controls']/input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//div[@class='controls']/input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.linkText("Log Out")).click();
		 driver.close();
	}

}
