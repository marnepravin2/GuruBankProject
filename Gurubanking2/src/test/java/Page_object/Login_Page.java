package Page_object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testBase.TestBase;

public class Login_Page extends TestBase {
	WebDriver driver;
	Login_Page lp;


	public Login_Page(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='uid']") 
	WebElement uid;

	@FindBy(xpath="//input[@name='password']") 
	WebElement password;

	@FindBy(xpath="//input[@name='btnLogin']") 
	WebElement btnLogin;
	
	@FindBy(xpath  = "//input[@name='btnReset']")
	WebElement Reset;
	
	@FindBy(xpath = "//img[@src='/logo.png']")
	WebElement imglogo;
	
	@FindBy(xpath  = "//marquee[@class='heading3']")
	WebElement Welcomemsg;
	


	
	
		public void EnteruserID(String userid) {
		try {
	uid.clear();
	uid.sendKeys(userid);
		}
		catch (Exception e) {
			e.getStackTrace();

		}

	}

	public void EnterPass(String pass) {

		try {
		password.clear();
		password.sendKeys(pass);
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
	public void clickLogButt() {
		btnLogin.click();

	}

	
    public void buttonReset() {
	     Reset.click();
		
		
	}
	
	public boolean verifybankguru99logo() {
		try {
	return imglogo.isDisplayed();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
		}


	public String shoeMsg() {
		try {
		return	Welcomemsg.getText();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
		
	}
	
	public String popUpMsg() {
	
		try {
	return	driver.switchTo().alert().getText();
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
		
		
	}
	
	public void popUpOkBtn() {
		
		try {
		driver.switchTo().alert().accept();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		
	}
	public String verifyTextPass() {
		try {
	       return password.getAttribute("value");
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}
	
	public void loginTestcorrect() {

		lp.EnteruserID("mngr448494");
	    lp.EnterPass("ynUtemE");
		lp.clickLogButt();

		if (lp.shoeMsg().equals("Welcome To Manager's Page of Guru99 Bank")) {
		 
			Assert.assertTrue(true);
			System.out.println("Login Susses...");
		} else {
			Assert.assertTrue(false);
			System.out.println("Login fail....");
		}
		
	}

	


}