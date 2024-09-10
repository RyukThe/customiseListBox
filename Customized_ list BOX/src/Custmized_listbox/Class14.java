package Custmized_listbox;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class14
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement mon = m.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Actions m1= new  Actions(m);
		m1.click(mon).perform();
		
		
		Thread.sleep(2000);
		
		m1.sendKeys(Keys.ARROW_UP).perform();
		m1.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(2000);
		
		m1.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
