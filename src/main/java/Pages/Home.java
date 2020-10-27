package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Testbase.Testbase;

public class Home extends Testbase {
	
	@FindBy(xpath="//input[@id=\"txtMobileNo\"]") private WebElement mobilenumber;
	@FindBy(xpath="//select[@id=\"ddlMobileServiceProvider\"]") private WebElement serviceprovider;
	@FindBy(xpath="//input[@id=\"amount_textfield\"]") private WebElement amount;
	@FindBy(xpath="//input[@id=\"imgbtnMobileRecharge\"]") private WebElement rechargebutton;
	@FindBy(xpath="//a[@href=\"//www.justrechargeit.com\"]") private WebElement logo;
	@FindBy(xpath="//img[@title=\"Sign In with Facebook\"]") private WebElement signinfblink;
	@FindBy(xpath="//img[@title=\"Sign In with Google\"]") private WebElement signingooglelink;
	
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
public void set_mobilenumber(String mob)
{
	mobilenumber.sendKeys(mob);
}

public void set_seriveprovider(String sp)
{
	Select s = new Select(serviceprovider);
	s.selectByVisibleText(sp);
}

public void set_amount(String am)
{
	amount.sendKeys(am);

}

public boolean clickrecharge()
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", rechargebutton);
	boolean fblink=signinfblink.isDisplayed();
	return fblink;
}

public boolean checkFblink()
{
	boolean fblink=signinfblink.isDisplayed();
	return fblink;
}

public boolean checkGooglelink()
{
	boolean googlelink=signingooglelink.isDisplayed();
	return googlelink;
}

public boolean check_logo()
{
	boolean logodisplayed=logo.isDisplayed();
	return logodisplayed;
}
}
