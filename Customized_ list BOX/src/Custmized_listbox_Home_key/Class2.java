package Custmized_listbox_Home_key;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	m.findElement(By.xpath("//a[text()='Create New Account']")).click();	
		WebElement kd= m.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Actions m1= new Actions(m);
		m1.click(kd).perform();
		m1.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		 for(int i=1;i<=6;i++)
		 {
			 m1.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000); 
		 }
		 
		 m1.sendKeys(Keys.ENTER).perform();
		

		

		
	}

}
