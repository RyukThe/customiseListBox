package Custmized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class15
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement web = m.findElement(By.xpath("//a[text()='Create New Account']"));

		Actions mk= new Actions(m);
		mk.click(web).perform();
		Thread.sleep(200);
		WebElement mon = m.findElement(By.xpath("//select[@name='birthday_month']"));
		mk.click(mon).perform();
		
		Thread.sleep(2000);
		for(int i=1;i<=5;i++);
		{
			mk.sendKeys(Keys.ARROW_UP).perform();
		}
		Thread.sleep(2000);
		
		for(int i=1;i<=4;i++)
		{
			mk.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		Thread.sleep(2000);
		mk.sendKeys(Keys.ENTER).perform();
		
	}

}
