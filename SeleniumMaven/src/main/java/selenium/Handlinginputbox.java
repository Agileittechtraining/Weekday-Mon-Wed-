package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinginputbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	    ChromeDriver chrome = new ChromeDriver();
	    chrome.get("https://www.facebook.com/");
	    chrome.findElement(By.cssSelector("#email")).sendKeys("abc@facebook.com");
	    chrome.findElement(By.id("pass")).sendKeys("abc@12345");
	}

}
