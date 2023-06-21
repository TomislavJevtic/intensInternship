package Sobotec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPage extends BasePage {

    private By projectTab = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div/div/div/ul/li[3]/div/div[1]/a");

    private By overview = By.className("mainnav-menu-items.active");
//werwerwerwr

    public WebElement getProjectTab() {
        return getDriver().findElement(projectTab);
    }
    public WebElement getOverview() {
        return getDriver().findElement(overview);
    }


    public ProjectPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
