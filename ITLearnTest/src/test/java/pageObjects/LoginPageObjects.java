package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@FindBy(xpath = "(//a[@class='lg_button'])[1]")
	public static WebElement Loginbtn;

	@FindBy(id = "user_login")
	public static WebElement username;

	@FindBy(id = "user_pass")
	public static WebElement password;

	@FindBy(id = "wp-submit")
	public static WebElement submitbtn;
	
	@FindBy(xpath = "//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']")
	public static WebElement allcourses;
	
}
