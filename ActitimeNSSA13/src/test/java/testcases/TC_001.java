package testcases;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC_001 extends BaseTest 
{
	@Test
	public void copyTask()
	{
		Homepage h =new Homepage(driver, webActionUtil);
		h.clickOnTask();
		h.clickOnActions();
		h.clickOnCopyTo();
		h.selectCustomer();
		h.selectProject();
		h.clickOnCopyButton();
	}

}
