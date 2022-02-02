package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");//chrome
System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");
ChromeDriver chrome = new ChromeDriver();
chrome.get("https://www.selenium.dev/");
chrome.close();
FirefoxDriver firefox = new FirefoxDriver();
firefox.get("https://www.selenium.dev/");
firefox.close();
EdgeDriver edge = new EdgeDriver();
//edge.get("https://www.selenium.dev/");
edge.navigate().to("https://www.selenium.dev/");
edge.close();
	}

}
