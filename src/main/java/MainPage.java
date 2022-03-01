import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By signInButton = By.xpath("//a[text()='Sign in']");
    private By signUpButton = By.xpath("//a[text()='Sign up']");
    private By signUpFormButton = By.xpath("//button[text()='Sign up for GitHub']");
    private By userNameField = By.xpath(".//*[@id='user(login)']");
    private By userMailField = By.xpath(".//*[@id='user(email)']");
    private By userPasswordField = By.xpath(".//*[@id='user(password)']");

    public LoginPage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton(){
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpFormButton(){
        driver.findElement(signUpFormButton).click();
        return new SignUpPage(driver);
    }

    public MainPage typeUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public MainPage typePassword (String password){
        driver.findElement(userPasswordField).sendKeys(password);
        return this;
    }

    public MainPage typeEmail (String email){
        driver.findElement(userMailField).sendKeys(email);
        return this;
    }

    public SignUpPage register(String username, String password, String email){
        this.typeUserName(username);
        this.typePassword(password);
        this.typeEmail(email);
        this.clickSignUpFormButton();
        return new SignUpPage(driver);
    }


}
