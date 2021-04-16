package com.sk.selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBro {
	public static WebDriver driver=null; 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Gira Gira Gira");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		String title=driver.getTitle();
		if(title.contains("Gira")) {
			System.out.println("Search Successful");
		}
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		//driver.assertEquals();
		driver.close();
		
	}

}
