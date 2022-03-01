import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        System.setProperty("", "");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com");
        mainPage = new MainPage(driver);
    }

    @Test
    public void signIn(){
        LoginPage loginPage = mainPage.clickSignInButton();
        String heading = loginPage.getHeadingText();
        Assert.assertEquals("Sign in to GitHub", heading);
    }

    @Test
    public void registerFailTest(){
        SignUpPage signUpPage = mainPage.register("test", "testpass", "test@test.com");
//        String error = SignUpPage.getMainErrorText();
//        Assert.assertEquals("There were problems creating your account", error);
    }

    @Test
    public void signUpEmptyUsernameTest(){
        SignUpPage signUpPage = mainPage.register("","testpass","");
//        String error = signUpPage.getUsernameErrorText();
//        Assert.assertEquals("Login can't be blank", error);
    }
    @Test
    public void signUpInvalidEmailTest(){
        SignUpPage signUpPage = mainPage.register("test","testpass","test");
//        String error = signUpPage.getEmailErrorText();
//        Assert.assertEquals("Email is invalid or already taken", error);
    }


    @After
    public void tearDown(){
        driver.quit();
    }

}
