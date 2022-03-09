package searchchangepartment;

import org.junit.Test;
import tests.BaseTest;

import static constants.Constant.TimeoutVariable.REAL_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkRedirectToListing () {
        basePage.open(REAL_HOME_PAGE);
        realtHomePage
                .enterCountRooms()
                .clickToFind();
    }
}
