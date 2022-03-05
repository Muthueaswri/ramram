package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver dd=new ChromeDriver();
		dd.get("http://www.w3schools.com/html/html_tables.asp");
		WebElement tableDat=dd.findElement(By.id("customers"));
		
		
		
	}

}
