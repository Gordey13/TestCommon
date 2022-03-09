package github;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.reflect.misc.FieldUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass {


//    static WebDriverWait wait = (new WebDriverWait(driver, 5));

    public static void main(String[] args ){
        System.setProperty("webdriver.chrome.driver", "C:\\TestCommon\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";









//        driver.findElement(By.xpath("//a[@aria-lable='Поиск по картинке']")).click();
//        driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
//        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\test\\pic.png");


//         take screenshot of the page
//        File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(screenshot, new File("C:\\" + fileName));
//        } catch (Exception e) {
//            e.printStackTrace();}



//        String mainWindow = driver.getWindowHandle();
//
//        driver.findElement(By.xpath("//a[text()='JDK.exe']")).click();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.switchTo().alert().dismiss();
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("confirm('Are you sure?')");
//        js.executeScript("window.open()");
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        driver.switchTo().alert().accept();
//        for(String windowHandle: driver.getWindowHandles()) {
//            driver.switchTo().window(windowHandle);
//        }
//        driver.findElement(By.xpath("//h3[text()='Продукты Java']")).click();
//        driver.switchTo().window(mainWindow);
//
//        driver.findElement(By.xpath("f")).click();
//
//        for (String tab : driver.getWindowHandles()){
//            driver.switchTo().window(tab);
//        }


    }
}



//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("alert('Hello World');");
//        jse.executeScript("window.scrollBy(0, 1000)", "");




//    WebElement link = driver.findElement(By.xpath("//tr[@role='list']//a[text()='Электроника']"));
//    WebElement element = driver.findElement(By.xpath("//tr[@role='list']//a[text()='Электроника']"));
//    Actions actions = new Actions (driver);
//        actions.moveToElement(link).build().perform();
//        Метод мувЭлемент позволяет навести на элемент.
//        Вызываем билд - чтобы собрать все дейсвтия
//        Перформ - чтобы выполнить данный метод.
//        actions.dragAndDrop(element, link).build().perform();
//         Метод драг анд дроп Позволяет перетащить один элемент в другой.
//         Сурс и таргет начало и место куда должны перетащить элемент.
//        actions.clickAndHold(element).moveToElement(link).release();
//        Кликнуть на элемент и не отпускать клавишу мыши
//        Action action = actions.clickAndHold(element).moveToElement(link).release().build();
//        actions.doubleClick();  // Позволяет кликнуть два раза по элементу
//        actions.contextClick(); //Позволяет имитировать нажатие правой кнопкой мыши на элемент




//                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//                driver.manage().window().setSize(new Dimension(900, 500));
//      driver.get("https://www.selenium.dev/documentation/getting_started/installing_selenium_libraries/");
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("Explicit Wait")));
//                WebElement link = driver.findElement(By.linkText("Log in"));
//                WebElement link2 = driver.findElement(By.partialLinkText("Log in"));
//                driver.findElement(By.xpath("//input[@id='searchbutton']")).click();
//      driver.navigate().to("https://www.selenium.dev");
//      Обращаемся к методу get объекта driver класса WebDriver
//      driver.quit();
//      Позволяет закрывать браузер
//                System.out.println(driver.getTitle());
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchbutton'")));
//                System.out.println(driver.getCurrentUrl());