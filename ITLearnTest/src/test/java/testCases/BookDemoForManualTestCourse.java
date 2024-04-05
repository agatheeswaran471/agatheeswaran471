package testCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BaseTest;
import pageObjects.LoginPageObjects;
import pageObjects.ManualTestingBookDemoPageObjects;

public class BookDemoForManualTestCourse extends BaseTest{

	public void login() {

		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.Loginbtn.click();
		LoginPageObjects.username.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		LoginPageObjects.submitbtn.submit();
	}
	@Test
	public void bookDemo() {
		login();
		PageFactory.initElements(driver, ManualTestingBookDemoPageObjects.class);
		ManualTestingBookDemoPageObjects.bookdemo.click();
		ManualTestingBookDemoPageObjects.name.sendKeys("Test");
		ManualTestingBookDemoPageObjects.email.sendKeys("test@gmail.com");
		ManualTestingBookDemoPageObjects.phone.sendKeys("23432321123");
		ManualTestingBookDemoPageObjects.message.sendKeys("For testing purpose");
		ManualTestingBookDemoPageObjects.submitbtn.click();
		String successmsg= ManualTestingBookDemoPageObjects.successmsg.getText();

		Assert.assertEquals(successmsg, "Form submitted successfully.");

	}


}
