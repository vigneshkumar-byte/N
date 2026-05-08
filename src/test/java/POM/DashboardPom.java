package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPom extends BasePom {
	public WebDriver driver;
	public DashboardPom(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//h6[text()='Dashboard']")WebElement db;
	
	public boolean dbIsDisplay()
	{
		return db.isDisplayed();
	}

}
