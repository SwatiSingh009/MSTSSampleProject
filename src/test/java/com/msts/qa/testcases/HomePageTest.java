package com.msts.qa.testcases;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.msts.qa.base.TestBase;
	import com.msts.qa.pages.HomePage;


	public class HomePageTest extends TestBase {
		HomePage homePage;

		public HomePageTest() {
			super();
		}

		//test cases should be separated -- independent with each other
		//before each test case -- launch the browser and login
		//@test -- execute test case
		//after each test case -- close the browser
		
		@BeforeMethod
		public void setUp() {
			initialization();
			homePage=new HomePage();
		}
		
		
		@Test(priority=1)
		public void verifyHomePageTitleTest() throws InterruptedException{
			String homePageTitle = homePage.verifyHomePageTitle();
			System.out.println("Home Page title fetched is "+homePageTitle);
			Assert.assertEquals(homePageTitle, "MSTS","Home page title not matched");
		}
		
		@Test(priority=2)
		public void verifyLinkDisplayTest(){
			Assert.assertTrue(homePage.verifyOurSolutionLinkDisplayed());
		}
			
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		

	}
