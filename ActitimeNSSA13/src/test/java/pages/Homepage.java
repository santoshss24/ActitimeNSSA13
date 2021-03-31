package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage 
{
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "(//div[text()='Calls'])[1]")
	private WebElement callsTask;
	
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement actionsDropdown;
	
	@FindBy(xpath = "//div[text()='Copy to']")
	private WebElement copyToButton;
	
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement selectCustomerDropdown;
	
	@FindBy(xpath = "//div[text()='Big Bang Company']")
	private WebElement selectCustomeroption;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement selectProjectDropdown;
	
	@FindBy(xpath = "//div[text()='Flight operations']")
	private WebElement selectProject;
	
	@FindBy(xpath = "//div[text()='Copy']")
	private WebElement copyButton;

	public Homepage(WebDriver driver, library.webActionUtil webActionUtil) {
		super(driver, webActionUtil);
		// TODO Auto-generated constructor stub
	}
	
	
	public void clickOnTask()
	{
		webActionUtil.clickOnElement(callsTask);
	}
	
	public void clickOnActions()
	{
		webActionUtil.clickOnElement(actionsDropdown);
	}
	
	public void clickOnCopyTo()
	{
		webActionUtil.clickOnElement(copyToButton);
	}
	
	public void selectCustomer()
	{
		webActionUtil.clickOnElement(selectCustomerDropdown);
		webActionUtil.clickOnElement(selectCustomeroption);
	}
	
	public void selectProject()
	{
		webActionUtil.clickOnElement(selectProjectDropdown);
		webActionUtil.clickOnElement(selectProject);
	}
	
	public void clickOnCopyButton()
	{
		webActionUtil.clickOnElement(copyButton);
	}
	
	public void clickOnlogout()
	{
		webActionUtil.clickOnElement(logoutLink);
	}

}
