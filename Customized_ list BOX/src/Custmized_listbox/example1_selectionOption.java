package Custmized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_selectionOption
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver.exe");                
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2:
		Actions act=new Actions(driver);
		
		//step3: 
		act.click(month).perform();
		
		Thread.sleep(2000);

		//step4:
		//4A:  navigate to 1 option to top using "Arrow_UP"  key
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(2000);
		
		//4B:  navigate to 1 option to bottom using "Arrow_Down"  key
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		//4C:  Select option using "Enter" key
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}