package Custmized_listbox;

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
		WebDriver m= new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement sa = m.findElement(By.xpath("//a[text()='Create New Account']"));
		Actions ml=new Actions(m);
		ml.moveToElement(sa).click().build().perform();
		
		WebElement monElement= m.findElement(By.xpath("//select[@name='birthday_month']"));
		ml.click(monElement).perform();
		
		ml.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		ml.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		ml.sendKeys(Keys.ENTER).perform();
		
		
	}

}
