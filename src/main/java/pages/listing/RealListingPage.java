package pages.listing;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealListingPage extends BasePage {

    public RealListingPage(WebDriver driver){
        super(driver);
    }

    private final By card = By.xpath("//div[@class='listing-item highLighted']");

    public RealListingPage checkCountCards (){
        int countCard = driver.findElement(card).size();
        Assert.assertEquals(countCard, 21);
        return this;
    }

}
