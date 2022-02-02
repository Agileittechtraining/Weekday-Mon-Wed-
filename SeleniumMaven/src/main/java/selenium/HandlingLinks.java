package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	    ChromeDriver chrome = new ChromeDriver();
	    chrome.get("https://www.selenium.dev/");
	    chrome.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[2]/div/a")).click();
	}

}
