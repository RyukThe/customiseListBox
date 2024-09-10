package Custmized_listbox_Home_key;

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
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement sd = m.findElement(By.xpath("//a[text()='Create New Account']"));
		
		Actions ml= new Actions(m);
		ml.click(sd).perform();
		
		WebElement kd= m.findElement(By.xpath("//select[@name='birthday_month']"));
		ml.click(kd).perform();
		ml.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		
		for(int i=0; i<=5;i++)
		{
			ml.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		Thread.sleep(2000);
		ml.sendKeys(Keys.ENTER).perform();
	}

}
