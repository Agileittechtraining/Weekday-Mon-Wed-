package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdynamicelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	    ChromeDriver chrome = new ChromeDriver();
	    chrome.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    //chrome.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("ABCD");
	    chrome.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("XYZABC");
	    String str = chrome.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[1]/td")).getText();
	    System.out.println(str);
	}

}
