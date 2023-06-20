package Sobotec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SystemsPage extends BasePage{
    private By createBtn = By.id("createButton");
    private By threeDotsBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/button");

    public SystemsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
