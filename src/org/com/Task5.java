package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver dd=new ChromeDriver();
		dd.get("http://www.amazon.in\r\n"
				+ "/");
	}

}
