package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Home;
import Testbase.Testbase;
import Customlisteners.TestListeners;

@Listeners(TestListeners.class)

public class Verifyrecharge extends Testbase {
	
	@BeforeMethod(groups= {"link"})
	public void before_Setup()
	{
		beforesetup("chrome");
	}
	
	@Test
	public void verifyrecharge() throws InterruptedException, IOException
	{
		Home h = new Home(driver);
				h.set_mobilenumber("8600757011");
				Thread.sleep(2000);
				h.set_seriveprovider("BSNL");
				Thread.sleep(2000);
				h.set_amount("500");
				Thread.sleep(2000);	
		Assert.assertTrue(h.clickrecharge());
	}
	
	@Test public void logo_visible()
	{
	Home h = new Home(driver);
	Assert.assertTrue(h.check_logo());
	}
	
	@Test public void falseTest()
	{
		System.out.println("in the falseTest()");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"link"}) public void fbLinkVisible()
	{
		Home h = new Home(driver);
		Assert.assertTrue(h.checkFblink());
	}
	
	@Test(groups= {"link"}) public void googleLinkVisible()
	{
		Home h = new Home(driver);
		Assert.assertTrue(h.checkGooglelink());
	}
	
	@AfterMethod(groups= {"link"})
	public void after_Setup() throws InterruptedException
	{	
		Thread.sleep(2000);
		aftersetup();
	}


}
