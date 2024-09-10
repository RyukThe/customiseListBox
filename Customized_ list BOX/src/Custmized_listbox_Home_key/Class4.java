package Custmized_listbox_Home_key;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class4
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement me = m.findElement(By.xpath("//a[text()='Create New Account']"));
		Actions mq = new Actions(m);
		mq.click(me).perform();
		WebElement ml= me.findElement(By.xpath("//select[@name='birthday_month']"));
		mq.click(ml).perform();
		
		mq.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		for(int i = 1; i<=9;i++)
		{
			mq.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			
		}
		
		Thread.sleep(2000);
		
		mq.sendKeys(Keys.ENTER).perform();
		
	}

}
