package phptravels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	String browsername = "chrome";
	WebDriver browser;
@BeforeTest
public void initializebrowsers() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");//chrome
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");
    if(browsername.equalsIgnoreCase("FIREFOX")) {
    	browser = new FirefoxDriver();
    }else if(browsername.equalsIgnoreCase("CHROME")) {
    	browser = new ChromeDriver();
    }else if (browsername.equalsIgnoreCase("EDGE")) {
    	browser = new EdgeDriver();
      }else {
    	  System.out.println("Please select only firfox , chrome or edge only");
      }
}
@Test(priority =1)
public void openurl() {
	String Expected = "Administator Login";
	browser.manage().window().maximize();
	browser.get("https://phptravels.net/api/admin");
	browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Assert.assertEquals(browser.getTitle(), Expected);
}
@Test(priority =2)
public void loginintoapplication() {
	String ExpectedResult = "Sales overview & summary";
	browser.findElement(By.name("email")).sendKeys("admin@phptravels.com");
	browser.findElement(By.name("password")).sendKeys("demoadmin");
	browser.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")).click();
    String ActualResult = browser.findElement(By.xpath("//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div[1]/div")).getText();
    Assert.assertEquals(ActualResult, ExpectedResult);
}
@Test(priority =3)
public void clickbookings() {
	String ExpectedResult = "All Bookings View";
	browser.findElement(By.xpath("//*[@id=\"drawerAccordion\"]/div[1]/div/a[17]")).click();
	String ActualResult = browser.getTitle();
    Assert.assertEquals(ActualResult, ExpectedResult);
    
}
@Test(priority =4)
public void webtables() {
	int ExpectedResult = 8;
	List<WebElement> customer = browser.findElements(By.xpath("//table[@id='data']/tbody/tr/td[4]"));
	int ActualResult =customer.size();
    Assert.assertEquals(ActualResult, ExpectedResult);
    if (ActualResult ==8) {
    	List<WebElement> date = browser.findElements(By.xpath("//table[@id='data']/tbody/tr/td[8]"));
	    JavascriptExecutor js = (JavascriptExecutor)browser;
	    js.executeScript("window.scrollBy(0,700)", "");
	    for(int i=0;i<customer.size();i++) {
	    	System.out.print(customer.get(i).getText()+"--->");
	    	System.out.println(date.get(i).getText());
	    }
    }
}
@Test(priority =5)
public void logout() {
	String Expected = "Administator Login";
	browser.findElement(By.id("dropdownMenuProfile")).click();
	Actions A = new Actions(browser);
	WebElement logout = browser.findElement(By.xpath("/html/body/nav/div/div/div/div[3]/ul/li[5]/a"));
	A.moveToElement(logout).click().build().perform();
	Assert.assertEquals(browser.getTitle(), Expected);
}  
@AfterTest
public void closebrowser() {
	browser.close();
}
}
