package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHrmLoginPage extends BasePom {
	WebDriver driver;
	public OrangeHrmLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(name="username")WebElement txtBoxUsername;
	@FindBy(name="password")WebElement txtPassword;
	@FindBy(xpath="//button[@type='submit']") WebElement btnSubmit;
	public void enterUname(String un)
	{
		txtBoxUsername.sendKeys(un);	
	}
	public void enterPwd(String pw)
	{
		txtPassword.sendKeys(pw);	
	}
	public void clkSubmitBtn()
	{
		btnSubmit.click();	
	}
	
}
