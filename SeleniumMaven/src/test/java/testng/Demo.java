package testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
@Test(priority = 1)
public void openurl() {
	System.out.println("This is a demo test case");
    Assert.assertEquals("A", "A");
}
@Test(priority = 2,dependsOnMethods = "openurl")
public void findelement() {
	System.out.println("This is my next test case");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("A", "B");
	sa.assertAll();
}
@BeforeTest
public void precondition() {
	System.out.println("This is from precondition");
}
@AfterTest
public void postcondition() {
	System.out.println("This is from PostCondition");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is from beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is from aftersuite");
}
}
