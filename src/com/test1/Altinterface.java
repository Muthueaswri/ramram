package com.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Altinterface {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver dd=new ChromeDriver();
		dd.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		WebElement Altxt = dd.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		Altxt.click();
		WebElement Atxt = dd.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		Atxt.click();
		Alert al = dd.switchTo().alert();
		al.sendKeys("Muthu");
		al.accept();
		WebElement sttxt = dd.findElement(By.id("demo1"));
		String data = sttxt.getText();
		System.out.println(data);
		
		
		
	}
	

}
