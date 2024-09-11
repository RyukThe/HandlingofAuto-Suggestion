package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3
{
	public static void main(String[] args)
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.google.com/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.switchTo().frame("callout");
		
		
		m.findElement(By.xpath("//button[text()='No thanks']")).click();
		m.switchTo().defaultContent();
		m.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Apple");
		List<WebElement> sd = m.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		String k="apple india";
		for(WebElement d:sd)
		{
			
			String sdd = d.getText();
			
			if(k.equals(sdd))
			{
				d.click();
				
				break;
			}
			
		}
		
	}

}
