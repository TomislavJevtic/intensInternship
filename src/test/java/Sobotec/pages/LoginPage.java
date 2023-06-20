package Sobotec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By usernameField = By.id("LoginInput_UserNameOrEmailAddress");
    private By passwordField = By.id("LoginInput_Password");
    private By loginBtn = By.name("Action");

    public WebElement getUsername() {
        return getDriver().findElement(usernameField);
    }
    public WebElement getPassword() {
        return getDriver().findElement(passwordField);
    }
    public WebElement getLoginBtn() {
        return getDriver().findElement(loginBtn);
    }

    public void login(String username, String password) {
        getUsername().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginBtn().click();
    }




    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);


    }
}
