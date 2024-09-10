package Custmized_listbox_End_key;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement cr = m.findElement(By.xpath("//a[text()='Create New Account']"));
		
		Actions mk= new Actions(m);
		mk.click(cr).perform();
		
		WebElement mon = m.findElement(By.xpath("//select[@id='month']"));
		mk.click(mon).perform();
		mk.sendKeys(Keys.END).perform();
		
		for(int i=1;i<=3;i++)
		{
			mk.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		
		Thread.sleep(2000);
		
		mk.sendKeys(Keys.ENTER).perform();
		
		System.out.println("selecting day");
		
		WebElement day = m.findElement(By.xpath("//select[@name='birthday_day']"));
		
		mk.click(day).perform();
		
		mk.sendKeys(Keys.END).perform();
		
		for(int i= 0;i<=25;i++)
		{
		
			mk.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(300);
		}
	
		mk.sendKeys(Keys.ENTER).perform();
		
		System.out.println("selecting year");
		WebElement year = m.findElement(By.xpath("//select[@name='birthday_year']"));
		mk.click(year).perform();
		mk.sendKeys(Keys.END).perform();
		
		for(int i = 0;i<=26;i++)
		{
		
			mk.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
		}
		
		mk.sendKeys(Keys.ENTER).perform();
	}

}
