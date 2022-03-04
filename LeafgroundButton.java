package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/Button.html");
		 System.out.println(driver.findElement(By.xpath("//label/following::button[@id='position']")).getLocation());
		 System.out.println(driver.findElement(By.xpath("//label/following::button[@id='position']")).getLocation().getY());
System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getCssValue("background-color"));
System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());

	}

}
