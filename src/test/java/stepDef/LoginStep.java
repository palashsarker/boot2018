package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("^Admin Navigate to HRM Login page$")
	public void admin_Navigate_to_HRM_Login_page() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\palsa\\Desktop\\palashs\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^Admin enter valid UserName and Password$")
	public void admin_enter_valid_UserName_and_Password() throws Throwable {
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	  
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button']")).click();
	}

	@Then("^Admin will land in Admin home page$")
	public void admin_will_land_in_Admin_home_page() throws Throwable {
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
	  
	}
	
	

}//end class
