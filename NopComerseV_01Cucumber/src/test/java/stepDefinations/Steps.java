package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib/chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(URL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		lp.setUserName(email);
		lp.setPassword(password);;
		
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp.clickLogin();
		Thread.sleep(2000);

	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
		Thread.sleep(2000);

	}

	@When("Click on Logout link")
	public void click_on_logout_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp.clickLogout();
		Thread.sleep(2000);
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
	
	
	//Customer features step 

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
		Assert.assertEquals(title, "Dashboard / nopCommerce administration");
	}
	@When("User Clicks on Customer menu")
	public void user_clicks_on_customer_menu() {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	@Then("Click on customer MenuItem")
	public void click_on_customer_menu_item() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("click on add new button")
	public void click_on_add_new_button() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("add customer info page gets open")
	public void add_customer_info_page_gets_open() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@When("User enters customer details")
	public void user_enters_customer_details() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@When("click in save button")
	public void click_in_save_button() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("{string} is displayed")
	public void is_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}


}
