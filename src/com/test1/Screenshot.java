package com.test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver dd=new ChromeDriver();
		dd.get("https://en-gb.facebook.com//");
		TakesScreenshot screenshot=(TakesScreenshot) dd;
		File s=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Ram Prabhu\\Desktop\\New folder\\ggdh.png");
		FileUtils.copyFile(s, dest);
				
		
		
	

}}
