package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinggroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	    ChromeDriver chrome = new ChromeDriver();
	    chrome.get("https://echoecho.com/htmlforms09.htm");
	    List<WebElement> l = chrome.findElements(By.name("Checkbox"));
	    System.out.println(l.size());
	    l.get(0).click();
	    l.get(2).click();
	}

}
