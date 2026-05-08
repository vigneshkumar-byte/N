package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.DashboardPom;
import POM.OrangeHrmLoginPage;
import TestBase.BaseClass;

public class SecondTc extends BaseClass {
	   @Test()
	    void Tc1()
	    {
	    	OrangeHrmLoginPage oh=new OrangeHrmLoginPage(driver);
	    	DashboardPom db=new DashboardPom(driver);
	    	oh.enterUname("Admin");
	    	oh.enterPwd("admin123");
	    	oh.clkSubmitBtn();
	    	Assert.assertTrue(true);
	    	
	    }
	   @Test(dependsOnMethods={"Tc1"})
	   void sam()
	   {
		   System.out.println("pass");
	   }
	   @Test(groups= {"reg"})
	   void b()
	   {
		   System.out.println("b");
	   }
	   @Test(groups= {"reg"})
	   void a()
	   {
		   System.out.println("a");
	   }
	   @Test(groups={"reg","smoke"})
	   void d()
	   {
		   System.out.println("d");
	   }

}
