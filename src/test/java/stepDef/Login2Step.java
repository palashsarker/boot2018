
package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import allBrowser.BrowserInitialize;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class Login2Step {
	WebDriver driver;
	BrowserInitialize br;
	LoginPage l;
	
	
	@Given("^Admin Navigateto HRM Login page$")
	public void admin_Navigateto_HRM_Login_page() throws Throwable {
		br=new BrowserInitialize();
		driver=br.ChooseBrowser();
	  
	}

	@When("^Admin enter validUserName and Password$")
	public void admin_enter_validUserName_and_Password() throws Throwable {
		l=new LoginPage(driver);
		l.EnterUserName1().sendKeys("Admin");
		l.EnterPassword1().sendKeys("admin");
				
		
	   
	}

	@When("^click on Loginbutton$")
	public void click_on_Loginbutton() throws Throwable {
	   l=new LoginPage(driver);
	   l.ClickLogin().click();
	}

	@Then("^Admin will land in Adminhome page$")
	public void admin_will_land_in_Adminhome_page() throws Throwable {
     Assert.assertEquals(driver.getCurrentUrl(),"http://opensource.demo.orangehrmlive.com/index.php/dashboard"); 
	 driver.close();
	}



}//end class
