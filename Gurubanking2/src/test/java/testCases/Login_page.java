package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_object.Login_Page;
import testBase.TestBase;


public class Login_page extends TestBase{
	Login_Page lp;


	
		
		@Test
		public void verifybankguru99LogoTC()  {
		

			lp = new Login_Page(driver);

			if (lp.verifybankguru99logo())

			{
				Assert.assertTrue(true);
				
				
				System.out.println("bankguru99 Logo is displayed on login page");
				
			} else {
				System.out.println("bankguru99 Logo is not displayed on login page");
				
				Assert.assertTrue(false);
			}

		}

		//Negative Test cases Automated
		
		@Test
		public void loginTest01() {

			lp.EnteruserID("mngr448493");
			lp.EnterPass("ynUtemE");
			lp.clickLogButt();
				Assert.assertEquals(lp.popUpMsg(),"User or Password is not valid");
				lp.popUpOkBtn();
				
			
		}
		
		@Test
		public void loginTest02() {

			lp.EnteruserID("mngr448494");
			lp.EnterPass("ynUtemaa");
			lp.clickLogButt();
				Assert.assertEquals(lp.popUpMsg(),"User or Password is not valid");
				lp.popUpOkBtn();
				
			
		}
		
		@Test
		public void loginTest03() {

			lp.EnteruserID("mngr1234");
			lp.EnterPass("abcdef");
			lp.clickLogButt();
				Assert.assertEquals(lp.popUpMsg(),"User or Password is not valid");
				lp.popUpOkBtn();
				
			
		}
		
		@Test
		public void reset() {

			lp.EnteruserID("mngr1234");
			lp.EnterPass("abcdef");
			lp.buttonReset();
			if(lp.verifyTextPass().equals(null) && lp.verifyTextPass().equals(null)) {
				Assert.assertEquals(lp.verifyTextPass(),null);
			}
			
		}

		

		@Test
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
	
