package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.google.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("sd");
		List<WebElement> d = m.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
	
			String k="sdlc";
			Thread.sleep(2000);
			for(WebElement o:d)
			{
				String sds = o.getText();
				
				if(k.equals(sds))
				{
					o.click();
					Thread.sleep(2000);
					break;
				}
			}
			
	}

}
