package Custmized_listbox_End_key;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class5 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement sa = m.findElement(By.xpath("//a[text()='Create New Account']"));
		Actions l= new Actions(m);
		l.click(sa).perform();
		WebElement mon = m.findElement(By.xpath("//select[@name='birthday_month']"));
		l.click(mon).perform();
		l.sendKeys(Keys.END).perform();
		
		for(int i = 0;i<=5;i++)
		{
			l.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
		}
		
		l.sendKeys(Keys.ENTER).perform();
		
	}

}
