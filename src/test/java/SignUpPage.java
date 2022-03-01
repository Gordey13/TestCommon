import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPage {
    WebDriver driver;
    SignUpPage signUpPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver... Название драйвера", "Путь до драйвера");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("Ссылка на стартовую страницу");
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void signUpWithShortPass() {
        SignUpPage sp = signUpPage.typePassword("test");
        String error = sp.getPasswordErrorText();
        Assert.assertEquals("Password is too about (minimum is 7 characters)", error);
    }

    @Test
    public void signUpReservedUsernameTest(){
        SignUpPage sp = signUpPage.typeUserName("Username");
        String error = sp.getUsernameErrorText();
        Assert.assertEquals("Username is a reserved word", error);
    }

    @Test
    public void signUpTakenUsername(){
        SignUpPage sp = signUpPage.typeUserName("user");
        String error = sp.getUsernameErrorText();
        Assert.assertEquals("Username is already taken", error);
    }

    @Test
    public void getHeadingTest(){
        String heading = signUpPage.getHeadingText();
        Assert.assertEquals("Join GitHub", heading);
    }

    @After
    public void tearDown(){
        driver.quit();
    }



}
