package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	    ChromeDriver chrome = new ChromeDriver();
	    chrome.get("https://echoecho.com/javascript4.htm");
	    chrome.findElement(By.name("B2")).click();
	    String str = chrome.switchTo().alert().getText();
	    chrome.switchTo().alert().dismiss();
	    //chrome.switchTo().alert().sendKeys("ABCD");
	    System.out.println(str);
	    
	}

}
