package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Page_object.Home_Page;
import Page_object.Login_Page;
import testBase.TestBase;

public class Home_page extends TestBase{
	//Home_Page hP;
	Login_Page lp;
	

	
	@Test
	public void test_case_001() {
		lp = new Login_Page(driver);
		lp.loginTestcorrect();
		
		
		
		
	
	


//		Home_Page hP = new Home_Page(driver);
//		hP=new Home_Page(driver);
//		hP.newcostomer("Pravin");
//		
	}
}
