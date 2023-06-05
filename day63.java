package com.example.flower;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day63 {

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
   driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
   driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("kani@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("kani3011");
	WebElement computer=driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Scanner\"]"));
	computer.click();
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();
	
	
	}
}
