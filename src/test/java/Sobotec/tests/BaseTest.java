package Sobotec.tests;

import Sobotec.pages.LoginPage;
import Sobotec.pages.ProjectPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class  BaseTest {
    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected LoginPage loginPage;

    protected ProjectPage projectPage;



    public BaseTest() {
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        loginPage = new LoginPage(driver, driverWait);
        projectPage = new ProjectPage(driver,driverWait);


    }
    @BeforeMethod
    public void methodSetup() {
        driver.get("https://sobotec.azurewebsites.net/");
        driver.manage().deleteAllCookies();
    }
    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();
    }

}
