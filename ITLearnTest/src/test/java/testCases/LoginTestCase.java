package testCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BaseTest;
import pageObjects.LoginPageObjects;

public class LoginTestCase extends BaseTest{
	@Test
	public void loginTest() {
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.Loginbtn.click();
		LoginPageObjects.username.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		LoginPageObjects.submitbtn.submit();
		String allcourses= LoginPageObjects.allcourses.getText();
	
		Assert.assertEquals(allcourses, "All Courses");
	}
}
