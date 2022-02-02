package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	    ChromeDriver chrome = new ChromeDriver();
	    chrome.manage().window().maximize();
	    chrome.get("https://phptravels.net/api/admin");
	    chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    chrome.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		chrome.findElement(By.name("password")).sendKeys("demoadmin");
		chrome.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")).click();
		chrome.findElement(By.xpath("//*[@id=\"drawerAccordion\"]/div[1]/div/a[17]")).click();
	    List<WebElement> customer = chrome.findElements(By.xpath("//table[@id='data']/tbody/tr/td[4]"));
	    List<WebElement> date     = chrome.findElements(By.xpath("//table[@id='data']/tbody/tr/td[8]"));
	    System.out.println(customer.size());
	    JavascriptExecutor js = (JavascriptExecutor)chrome;
	    js.executeScript("window.scrollBy(0,700)", "");
	    for(int i=0;i<customer.size();i++) {
	    	System.out.print(customer.get(i).getText()+"--->");
	    	System.out.println(date.get(i).getText());
	    }
	   chrome.findElement(By.id("dropdownMenuProfile")).click();
	   Actions A = new Actions(chrome);
	   WebElement logout = chrome.findElement(By.xpath("/html/body/nav/div/div/div/div[3]/ul/li[5]/a"));
	   A.moveToElement(logout).click().build().perform();
	}

}
