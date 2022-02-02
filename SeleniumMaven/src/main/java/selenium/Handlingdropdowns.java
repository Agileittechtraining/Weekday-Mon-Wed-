package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	    ChromeDriver chrome = new ChromeDriver();
	    chrome.manage().window().maximize();
	    //chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//global wait
	    chrome.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
	    WebElement country = chrome.findElement(By.id("coutry"));//15
	    country.sendKeys("Congo");
	    List<WebElement> l = country.findElements(By.tagName("option"));
	    for(int i=0;i<l.size();i++) {
	    	System.out.println(l.get(i).getText());
	    }
	}

}
