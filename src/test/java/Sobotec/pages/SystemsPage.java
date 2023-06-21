package Sobotec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SystemsPage extends BasePage{
    private By createBtn = By.id("createButton");
    private By threeDotsBtn = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/button");
    private By addNewComponent = By.xpath("/html/body/div[4]/div[3]/ul/li[2]/div/div/p");
    private By categorySelect = By.id(":r14:");
    private By subCategorySelect = By.id(":r17:");
    private By componentSelect = By.id(":r1b");

    public SystemsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getCreateBtn() {
        return getDriver().findElement(createBtn);
    }

    public WebElement getThreeDotsBtn() {
        return getDriver().findElement(threeDotsBtn);
    }

    public WebElement getAddNewComponent() {
        return getDriver().findElement(addNewComponent);
    }

    public WebElement getCategorySelect() {
        return getDriver().findElement(categorySelect);
    }

    public WebElement getSubCategorySelect() {
        return getDriver().findElement(subCategorySelect);
    }

    public WebElement getComponentSelect() {
        return getDriver().findElement(componentSelect);
    }

    public void selectCategory (String categoryName) {
        getCategorySelect().sendKeys(categoryName);
        getCategorySelect().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

    }

// driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadGrid1_ctl00_ctl02_ctl02_EditFormControl_rcbControllerType1_Input")).sendKeys("ValueTwo", Keys.ARROW_DOWN, Keys.ENTER)
}
