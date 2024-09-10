package Custmized_listbox_End_key;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class19 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement sd = m.findElement(By.xpath("//a[text()='Create New Account']"));
		
		Actions mk = new Actions(m);
		
		mk.click(sd).perform();
		WebElement sdd = m.findElement(By.xpath("//select[@name='birthday_month']"));
		mk.click(sdd).perform();
		mk.sendKeys(Keys.END).perform();
		
		for(int i=0;i<=5;i++)
		{
			mk.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
			
		}
		
		Thread.sleep(2000);
		mk.sendKeys(Keys.ENTER).perform();
		
	}

}
