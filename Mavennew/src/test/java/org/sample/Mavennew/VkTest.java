package org.sample.Mavennew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VkTest {
	
	

	@Test(priority = 0)
	public  void launch() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.diver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			//System.out.println("Hello world");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.close();
		
		
	}
	


	@Test (priority = 1,enabled = true)
	
	public void launch2 () {
		
		System.setProperty("webdriver.chrome.diver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://bookmyshow.com");
		
		System.out.println("Hi maven -change");
		
		
	}

}