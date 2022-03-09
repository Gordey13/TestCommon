package tests;

import common.CommonActions;
import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.listing.RealListingPage;
import pages.realt_home.RealtHomePage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealListingPage realListingPage = new RealListingPage(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
                    driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStrorage.clear()");
        }
    }
    @AfterSuite (alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }



}
