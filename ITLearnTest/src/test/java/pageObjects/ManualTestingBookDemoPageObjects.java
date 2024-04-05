package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManualTestingBookDemoPageObjects {
	
	@FindBy(xpath = "(//a[@class='bestPlanButton'])[2]")
	public static WebElement bookdemo;
	
	@FindBy(xpath = "//input[@id='nf-field-24']")
	public static WebElement name;
	
	@FindBy(xpath = "//input[@id='nf-field-25']")
	public static WebElement email;
	
	@FindBy(xpath = "//input[@id='nf-field-28']")
	public static WebElement phone;
	
	@FindBy(xpath = "//textarea[@id='nf-field-26']")
	public static WebElement message;
	
	@FindBy(xpath = "//input[@id='nf-field-27']")
	public static WebElement submitbtn;

	//Form submitted successfully.
	@FindBy(xpath = "//*[@id=\"nf-form-7-cont\"]/div/div[1]/p[1]")
	public static WebElement successmsg;
	
	
}
