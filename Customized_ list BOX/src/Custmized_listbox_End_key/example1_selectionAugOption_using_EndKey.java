package Custmized_listbox_End_key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_selectionAugOption_using_EndKey
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver.exe");                    //diffClassName.methodName();	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		act.click(month).perform();
		
		Thread.sleep(2000);
		
		//navigate to last option using "End" key
		act.sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);

		// navigate to Aug option  using "Arrow_UP"  key
		for(int i=1; i<=4; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		Thread.sleep(2000);
		
		// Select option using "Enter" key
		act.sendKeys(Keys.ENTER).perform();
		
	}

}