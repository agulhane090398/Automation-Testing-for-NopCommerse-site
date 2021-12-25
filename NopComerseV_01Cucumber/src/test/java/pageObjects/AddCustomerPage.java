package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	
	
	public  AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")
	WebElement custMenu;
	
	@FindBy(xpath="//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]")
	WebElement custMenuItem;
	
	@FindBy(xpath="//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]/i[1]")
	WebElement addNew;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement fName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lName;
	
	@FindBy(xpath="//input[@name=\"Gender\"]")
	WebElement gender;
	
	@FindBy(xpath="//input[@name=\"DateOfBirth\"]")
	WebElement dob;
	
	@FindBy(xpath="//input[@name=\"Company\"]")
	WebElement cName;
	
	@FindBy(xpath="//input[@name=\"IsTaxExempt\"]")
	WebElement tax;
	
	@FindBy(xpath="//div[@role=\"listbox\"]")
	WebElement newsLetter;
	
	@FindBy(xpath="//input[@role=\"listbox\"]")
	WebElement cRole;
	
	@FindBy(xpath="//select[@id=\"VendorId\"]")
	WebElement vendor;
	
	@FindBy(xpath="//textarea[@id=\"AdminComment\"]")
	WebElement comment;
	
	@FindBy(xpath="//body/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/i[1]")
	WebElement save;
	

	public void clickCMenu(String uname)
	{
		custMenu.click();
	}
	
	public void clickCMenuItem(String uname)
	{
		custMenuItem.click();
	}
	
	public void clickAddNew(String uname)
	{
		addNew.click();
	}
	
	public void setCustInfo(String uname)
	{
		
	}
	
}
