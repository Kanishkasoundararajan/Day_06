package com.example.flower;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day64 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   WebElement userName = driver.findElement(By.name("username"));
		  userName.sendKeys("Admin");
		  WebElement password= driver.findElement(By.name("password"));
		  password.sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   
	   
	}

}
