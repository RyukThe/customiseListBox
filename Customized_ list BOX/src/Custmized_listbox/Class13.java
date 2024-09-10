package Custmized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class13
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	m.findElement(By.xpath("//a[text()='Create New Account']")).click();
	WebElement month=m.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Thread.sleep(2000);
		 Actions mkl= new Actions(m);
	
		
	
		 mkl.click(month).perform();
		 mkl.sendKeys(Keys.ARROW_UP).perform();
		 mkl.sendKeys(Keys.ARROW_UP).perform();
		 
		 Thread.sleep(2000);
		 mkl.sendKeys(Keys.ENTER).perform();
		
	}

}
