package Custmized_listbox_End_key;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class3
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement mon = m.findElement(By.xpath("//select[@id='month']"));
		WebElement day = m.findElement((By.xpath("//select[@name='birthday_day']")));
		WebElement year = m.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Actions n= new Actions(m);
		n.click(mon).perform();
		n.sendKeys(Keys.END).perform();
		
		for(int i=1;i<=5;i++)
		{
			n.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
		}
		
		n.sendKeys(Keys.ENTER).perform();
		
		System.out.println("day");
		
		n.click(day).perform();
		n.sendKeys(Keys.END).perform();
		
		for(int i= 0; i<=25;i++)
		{
			n.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
		}
		
		n.sendKeys(Keys.ENTER).perform();
		
		System.out.println("year");
		
		n.click(year).perform();
		
		n.sendKeys(Keys.HOME).perform();
		for(int i=0;i<=24;i++)
		{
			n.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(200);
		}
		
		n.sendKeys(Keys.ENTER).perform();
		
	}

}
