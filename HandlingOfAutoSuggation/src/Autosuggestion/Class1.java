package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver m= new ChromeDriver();
		m.get("https://www.google.com/");
		m.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("sbi");
		
		Thread.sleep(2000);
		List<WebElement> s = m.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		String sb="sbi collect";
		for(WebElement o:s)
		{
			String sd = o.getText();
			
			if(sd.equals(sb))
			{
				o.click();
				
				break;
			}
		}

}}
