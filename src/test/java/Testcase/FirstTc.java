package Testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.DashboardPom;
import POM.OrangeHrmLoginPage;
import TestBase.BaseClass;

public class FirstTc extends BaseClass{
    @Test(dataProvider="dp")
    void Tc1(String un,String pw)
    {
    	OrangeHrmLoginPage oh=new OrangeHrmLoginPage(driver);
    	DashboardPom db=new DashboardPom(driver);
    	oh.enterUname(un);
    	oh.enterPwd(pw);
    	oh.clkSubmitBtn();
    	Assert.assertTrue(db.dbIsDisplay());
    	
    }
    
	@DataProvider(name="dp")
	Object[][] dat()
	{
		Object[][] data= {{"Admin","admin123"},{"asd","1234"
	}};
return data;

	}
}
